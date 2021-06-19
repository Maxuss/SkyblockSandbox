package com.prince.skyblocksandbox.skyblockcommands

import com.prince.skyblocksandbox.skyblockhandlers.MobHandler
import com.prince.skyblocksandbox.skyblockitems.SkyblockSword
import com.prince.skyblocksandbox.skyblockitems.data.ItemData
import com.prince.skyblocksandbox.skyblockitems.data.SwordStats
import com.prince.skyblocksandbox.skyblockmobs.SkyblockZombie
import com.prince.skyblocksandbox.skyblockutils.SkyblockRarities
import com.prince.skyblocksandbox.skyblockutils.SkyblockStats.getStats
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.math.BigInteger

class TestMobCommand(var mobHandler: MobHandler) : CommandExecutor {
    override fun onCommand(sender: CommandSender, cmd1: Command, label: String, args: Array<out String>): Boolean {
        if(!sender.isOp || sender !is Player){
            return true
        }
        if(args.size==1){
            try{
                mobHandler.spawnMob(SkyblockZombie(BigInteger.valueOf(args[0].toLong())),sender.location)
                sender.inventory.addItem(
                    SkyblockSword(
                        ItemData
                            (
                                "Aspect Of The End",
                                SkyblockRarities.RARE,
                                Material.DIAMOND_SWORD
                                ,true
                            ),
                        SwordStats
                            (
                        damage = 1000,
                        strength = 10000,
                        critDamage = 100,
                            critChance = 23
                            )
                    ).createItem())
                sender.getStats()
            }catch (e:Exception){
                return true
            }
        }
        return true
    }
}