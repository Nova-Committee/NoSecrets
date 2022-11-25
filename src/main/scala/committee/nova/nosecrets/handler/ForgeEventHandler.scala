package committee.nova.nosecrets.handler

import cpw.mods.fml.common.eventhandler.SubscribeEvent
import net.minecraft.client.gui.{GuiButton, GuiOptions}
import net.minecraftforge.client.event.GuiScreenEvent.InitGuiEvent
import net.minecraftforge.common.MinecraftForge

import scala.collection.JavaConversions._

object ForgeEventHandler {
  def init(): Unit = MinecraftForge.EVENT_BUS.register(new ForgeEventHandler)
}

class ForgeEventHandler {
  @SubscribeEvent
  def onGuiInit(event: InitGuiEvent.Post): Unit = {
    if (!event.gui.isInstanceOf[GuiOptions]) return
    for (b <- event.buttonList.asInstanceOf[java.util.List[GuiButton]] if b.id == 8675309) b.visible = false
  }
}
