package ch20;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {

	public static void main(String[] args) {
		try(FileChannel fChan = (FileChannel) 
				Files.newByteChannel(Paths.get("TEST.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)){
				ByteBuffer buf = ByteBuffer.allocate(26);
				for(int i = 0 ; i < 26; i++)
					buf.put((byte) ('A' + i));
				buf.rewind();
				fChan.write(buf);
				buf.rewind();
		} catch(IOException e){
			System.exit(1);
		}
	}

}
