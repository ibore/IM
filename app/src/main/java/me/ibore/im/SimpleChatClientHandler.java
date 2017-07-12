package me.ibore.im;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class SimpleChatClientHandler  extends  SimpleChannelInboundHandler<String> {
	
	protected void channelRead0(ChannelHandlerContext ctx, String s) throws Exception {

		System.out.println("---------------channelRead0 have received : " + s + "  ");
	}
}
