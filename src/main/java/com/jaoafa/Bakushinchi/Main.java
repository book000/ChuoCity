package com.jaoafa.Bakushinchi;

import org.bukkit.plugin.java.JavaPlugin;

import com.jaoafa.Bakushinchi.Command.Cmd_Bakushinchi;
import com.jaoafa.Bakushinchi.Event.Event_BakushinchiRailChecker;

public class Main extends JavaPlugin {
	private static Main Main = null;

	/**
	 * プラグインが起動したときに呼び出し
	 * @author mine_book000
	 * @since 2019/10/07
	 */
	@Override
	public void onEnable() {
		setMain(this);

		getCommand("bakushinchi").setExecutor(new Cmd_Bakushinchi());
		getServer().getPluginManager().registerEvents(new Event_BakushinchiRailChecker(), this);
	}

	public static JavaPlugin getJavaPlugin() {
		return Main;
	}

	public static Main getMain() {
		return Main;
	}

	public static void setMain(Main main) {
		Main = main;
	}
}
