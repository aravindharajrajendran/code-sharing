import com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessor;
import com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessorFactory;

/**
 * Created by araviraj on 6/19/17.
 */
public class IRecordProcessorFactoryClass implements IRecordProcessorFactory {

    public IRecordProcessorFactoryClass() {
        super();
    }

    public IRecordProcessor createProcessor() {
        return new IRecordProcessorClass();
    }
}