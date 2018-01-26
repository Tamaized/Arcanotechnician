package tamaized.arcanotechnician;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Arcanotechnician.MODID, version = Arcanotechnician.VERSION, acceptedMinecraftVersions = "[1.12,)")
public class Arcanotechnician {

	public static final String MODID = "arcanotechnician";
	public static final String VERSION = "${version}";

	public static final Logger LOGGER = LogManager.getLogger(MODID);

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}