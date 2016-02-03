/*
 * TODO Change the package name.
 */
package io.github.tapestryminecraft.atchat.atchatplugintemplate;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.channel.MessageReceiver;
import io.github.tapestryminecraft.atchat.AtChatChannel;

/*
 * TODO Change the class name.
 */
public class PluginTemplateChannel extends AtChatChannel{

	public PluginTemplateChannel() {
		/*
		 * TODO
		 * Take whatever arguments are required for an instance of the custom channel.
		 * 
		 * This will probably include 
		 */
	}

	public Collection<MessageReceiver> getMembers() {
		/*
		 * TODO
		 * Return a collection of MessageReceivers who should receive a message sent
		 * to this channel.  In such cases where no one should receive a message,
		 * return an empty collection.  It is usually desirable to send a message back
		 * to the sender.
		 */
		Set<MessageReceiver> members = new HashSet<MessageReceiver>();
		members.add(this.getSender());
		return members;
	}

	@Override
	protected String getChannelString() {
		/*
		 * TODO
		 * Return the String to be used to identify the channel in chat.
		 */
		return null;
	}

	@Override
	protected Player getSender() {
		/*
		 * TODO
		 * Return the Player who sent the message
		 */
		return null;
	}
	
	/*
	 * TODO
	 * Optionally override the sendMessage method to execute additional tasks whenever
	 * a message is sent.
	 * 
	 * If this.send(message) is not called here, nothing will be sent the the
	 * MessageReveivers returned by the getMembers method. 
	 */
//	@Override
//	public void sendMessage(Text message) {
//		this.send(message);
//	}
	
	/*
	 * TODO
	 * Optionally return TextColors, which will be applied to the channel name and
	 * sender name in chat.
	 */
//	@Override
//	protected TextColor channelColor() {
//		return TextColors.RESET;
//	}
//	
//	@Override
//	protected TextColor senderColor() {
//		return TextColors.RESET;
//	}

}
