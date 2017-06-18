package com.kingdee.apusic.customer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/** 
 * @author 陈庆钊
 * @version 2017-6-14 下午3:23:26
 * @Email parkme210@126.com
 */
public class DetailQueueConsumer implements MessageListener{

//	@Override
	public void onMessage(Message msg) {
		System.out.println("DetailQueueConsumer: " + new String(msg.getBody()));
	}
}
