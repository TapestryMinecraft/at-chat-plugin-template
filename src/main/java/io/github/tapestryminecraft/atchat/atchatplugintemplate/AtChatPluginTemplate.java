/*
 * TODO Change the package name
 */
package io.github.tapestryminecraft.atchat.atchatplugintemplate;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.plugin.Plugin;
import io.github.tapestryminecraft.atchat.AtChatChannel;
import io.github.tapestryminecraft.atchat.AtChatChannelController;
import io.github.tapestryminecraft.atchat.AtChatMessage;
import io.github.tapestryminecraft.atchat.AtChatPlugin;

/*
 * TODO set your own id, name, and version, and change the class name
 */
@Plugin(id = "at-chat-plugin-template", name = "AtChat Plugin Template", version = "0")
public class AtChatPluginTemplate extends AtChatPlugin{
	
	/*
	 * This method is called automatically when the server is started.
	 * Register an AtChatChannelController for each of your custom
	 * channels here using the atChat object, which is provided by this
	 * plugin's super class, AtChatPlugin.
	 * 
	 * In this example, the AtChatChannelController is defined as an
	 * anonymous class.
	 */
	@Override
	protected void registerChannelController() {
		this.atChat.registerChannel(new AtChatChannelController(){
			
			@Override
			public int argumentCount() {
				/*
				 * TODO
				 * Return the number of message "arguments" needed to 
				 * initialize a custom channel, where the first argument
				 * is the channel tag, and subsequent arguments contain
				 * additional information.
				 * 
				 * For example:
				 *   The default player channel takes a single argument,
				 *   which is the name of the player:
				 *     "@ItsNickBarry"
				 * 
				 *   The SMS channel takes two arguments, the tag and
				 *   the phone number:
				 *     "@sms 1234567890"
				 *   Find the SMS channel here:
				 *     https://github.com/TapestryMinecraft/at-chat-sms
				 */
				return 1;
			}

			@Override
			public String matcher() {
				/*
				 * TODO
				 * Return a regex matcher to determine which messages
				 * are handled by this channel controller.
				 * 
				 * For example, by default:
				 *   "[a-zA-Z0-9_]{4,16}" is used to match messages sent
				 *   to private player channels.
				 * 
				 *   "\\d{1,3}" is used to match messages sent to ranged
				 *   channels.
				 * 
				 * Avoid using matchers which conflict with the default
				 * matchers; use custom channels with fewer than 3
				 * characters, more than 16 characters, or which include
				 * special characters which cannot be used in Minecraft
				 * player names.
				 */
				return null;
			}

			@Override
			public AtChatChannel channel(Player sender, AtChatMessage message) {
				/*
				 * TODO
				 * Return an instance of your custom channel.
				 * Use the information contained in the message object
				 * to set it up.
				 * 
				 * The constructor should probably be made to accept and store
				 * the sender and the message or some data derived from the
				 * message.
				 */
				return new PluginTemplateChannel();
			}
			
			/*
			 * TODO
			 * Optionally return tab completion suggestions based on what has already
			 * been typed.
			 * Use the message object to get entered arguments.
			 * 
			 * The completions List is mutable and may contain default completion suggestions.
			 * It is advisable to call completions.clear() before adding suggestions to it.
			 */
//			@Override
//			public List<String> tabCompletions(List<String> completions, AtChatMessage message) {
//				return completions;
//			}
			
		});
	}
}
