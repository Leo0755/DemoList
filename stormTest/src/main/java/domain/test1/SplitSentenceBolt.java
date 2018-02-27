package domain.test1;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;

import java.util.Map;
/**
 * @Author Loujitao
 * @Date 2018/2/27
 * @Time  9:48
 * @Description: 订阅sentence spout发射的tuple流，实现分割单词
 */
public class SplitSentenceBolt extends BaseRichBolt {

    //BaseRichBolt是IComponent和IBolt接口的实现
    //继承这个类，就不用去实现本例不关心的方法
    private OutputCollector collector;
    /**
     * prepare()方法类似于ISpout 的open()方法。
     * 这个方法在blot初始化时调用，可以用来准备bolt用到的资源,比如数据库连接。
     * 本例子和SentenceSpout类一样,SplitSentenceBolt类不需要太多额外的初始化,
     * 所以prepare()方法只保存OutputCollector对象的引用。
     */
    public void prepare(Map map, TopologyContext topologyContext, OutputCollector outputCollector) {
        this.collector=outputCollector;
    }

    /**
     * SplitSentenceBolt核心功能是在类IBolt定义execute()方法，这个方法是IBolt接口中定义。
     * 每次Bolt从流接收一个订阅的tuple，都会调用这个方法。
     * 本例中,收到的元组中查找“sentence”的值,
     * 并将该值拆分成单个的词,然后按单词发出新的tuple。
     */
    public void execute(Tuple tuple) {
        String sentence = tuple.getStringByField("sentence");
        String[] words = sentence.split(" ");
        for (String word : words) {
            this.collector.emit(new Values(word));//向下一个bolt发射数据
        }
    }

    /**
     * plitSentenceBolt类定义一个元组流,每个包含一个字段(“word”)。
     */
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {
        outputFieldsDeclarer.declare(new Fields("word"));//告诉组件发出数据流包含sentence字段
    }
}