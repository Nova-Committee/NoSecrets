package committee.nova.nosecrets

import committee.nova.nosecrets.handler.ForgeEventHandler
import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.relauncher.Side

@Mod(modid = NoSecrets.MODID, useMetadata = true, modLanguage = "scala")
object NoSecrets {
  final val MODID = "nosecrets"

  @EventHandler
  def init(e: FMLInitializationEvent): Unit = if (e.getSide == Side.CLIENT) ForgeEventHandler.init()
}