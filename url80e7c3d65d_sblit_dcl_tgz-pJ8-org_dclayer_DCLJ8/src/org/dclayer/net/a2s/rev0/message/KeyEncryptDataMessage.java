package org.dclayer.net.a2s.rev0.message;

import org.dclayer.exception.net.buf.BufException;
import org.dclayer.exception.net.parse.ParseException;
import org.dclayer.net.PacketComponent;
import org.dclayer.net.a2s.A2SMessageReceiver;
import org.dclayer.net.a2s.A2SRevisionSpecificMessage;
import org.dclayer.net.a2s.message.KeyEncryptDataMessageI;
import org.dclayer.net.a2s.rev0.Rev0Message;
import org.dclayer.net.buf.ByteBuf;
import org.dclayer.net.component.DataComponent;

public class KeyEncryptDataMessage extends A2SRevisionSpecificMessage implements KeyEncryptDataMessageI {
	
	private DataComponent plainDataComponent = new DataComponent();
	
	@Override
	public void read(ByteBuf byteBuf) throws ParseException, BufException {
		plainDataComponent.read(byteBuf);
	}
	
	@Override
	public void write(ByteBuf byteBuf) throws BufException {
		plainDataComponent.write(byteBuf);
	}
	
	@Override
	public int length() {
		return plainDataComponent.length();
	}
	
	@Override
	public String toString() {
		return "KeyEncryptDataMessage";
	}
	
	@Override
	public PacketComponent[] getChildren() {
		return new PacketComponent[] { plainDataComponent };
	}
	
	@Override
	public byte getType() {
		return Rev0Message.KEY_ENCRYPT_DATA;
	}
	
	@Override
	public DataComponent getPlainDataComponent() {
		return plainDataComponent;
	}

	@Override
	public void callOnReceiveMethod(A2SMessageReceiver a2sMessageReceiver) {
		a2sMessageReceiver.onReceiveKeyEncryptDataMessage(plainDataComponent.getData());
	}

	@Override
	public int getMessageRevision() {
		return 0;
	}
	
}
