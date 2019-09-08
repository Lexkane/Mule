package task3;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

//FilePayload Transformer
public class FileToInputStream extends AbstractMessageTransformer {


	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {

		
		File payload= new File("src/main/recources/Invoice.csv");
		try {
			return new FileInputStream(payload);
		} catch (FileNotFoundException e) {
			throw new TransformerException(null);
		}
	}

}