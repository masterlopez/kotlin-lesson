fun main(args: Array<String>) {
    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of Speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.showInventory()


    /*val tim = Player("Tim", 4, 3, 200)
    println(tim)

    val enemy = Enemy("test enemy", 10, 3)
    println(enemy)

    enemy.takeDamage(4)
    println(enemy)

    enemy.takeDamage(11)
    println(enemy)

    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampire("Vlad")
    println(vlad)
    vlad.takeDamage(20)
    println(vlad)
*/
/*   for (i in 1 .. 10)
   {
       val drakula = KingVampire("Drakula")
       println(drakula)
       while (drakula.lives > 0)
       {
           if (drakula.dodges())
           {
               continue
           }
           if (drakula.runAway())
           {
               println("Drakula ran away")
               break
           }
           else
           {
               drakula.takeDamage(80)
           }
       }
       println("_____---------------------_______")
   }*/

    /*  val drakula = KingVampire("Drakula")
      println(drakula)

      drakula.lives = 0

      do
      {
          if (drakula.dodges())
          {
              drakula.lives += 1
              continue
          }
          if (drakula.runAway())
          {
              println("Drakula ran away")
              break
          }
          else
          {
              drakula.takeDamage(80)
          }
      } while (drakula.lives > 0)
      println("_____---------------------_______")
  */
//    val drakula = KingVampire("Drakula")
//    println(drakula)
//    while (drakula.lives > 0)
//    {
//        if (drakula.dodges())
//        {
//            continue
//        }
//        if (drakula.runAway())
//        {
//            println("Drakula ran away")
//            break
//        }
//        else
//        {
//            drakula.takeDamage(80)
//        }
//    }


/*   for (i in 100 downTo 1)
   {
       if ((i % 3) == 0 && (i % 5) == 0)
       {
           println("$i divides evenly with 3 and 5")
       }
   }*/


/*
    val tim = Player("Tim", 4, 3, 200)

    tim.weapon = Weapon("Spear", 14)

    val redPotion = Loot("Red Potion", LootType.POTION, 7.5)
    tim.getLoot(redPotion)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
    tim.getLoot(chestArmor)
    val ringProt = Loot("Ring of Protection", LootType.RING, 45.2)
    tim.getLoot(ringProt)
    tim.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))

    tim.showInventory()

    if (tim.dropLoot(redPotion))
    {
        tim.showInventory()
    }
    else
    {
        println("You don't have a ${redPotion.name}")
    }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)
    if (tim.dropLoot(bluePotion))
    {
        tim.showInventory()
    }
    else
    {
        println("You don't have ${bluePotion.name}")
    }

    if (tim.dropLoot("Invisibility Potion"))
    {
        tim.showInventory()
    }
    else
    {
        println("You don't have an Invisibility Potion")
    }
*/

}