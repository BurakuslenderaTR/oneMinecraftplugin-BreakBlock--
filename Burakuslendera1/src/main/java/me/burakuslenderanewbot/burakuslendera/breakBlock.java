     package me.burakuslenderanewbot.burakuslendera;
     import org.bukkit.Material;
     import org.bukkit.block.Block;
     import org.bukkit.event.EventHandler;
     import org.bukkit.event.Listener;
     import org.bukkit.event.block.BlockBreakEvent;
     import org.bukkit.inventory.ItemStack;
     public class breakBlock implements Listener {
     @EventHandler
     public void onPlayerBreakBlock(BlockBreakEvent event) {
     Block blockBroken = event.getBlock();
     if (blockBroken.getType()== Material.DIAMOND_ORE) {
        event.setCancelled(true);
        blockBroken.setType(Material.AIR);
        ItemStack elmas_diamond = new ItemStack(Material.DIAMOND, 228);

        blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation() , elmas_diamond );
        }
     if (blockBroken.getType()==Material.TALL_GRASS) {
         event.setCancelled(true);
         blockBroken.setType(Material.AIR);
         ItemStack komur_COAL = new ItemStack(Material.COAL, 228);
         blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(),komur_COAL);
        }
     if (blockBroken.getType()==Material.GRASS_BLOCK) {
        event.setCancelled(true);
         blockBroken.setType(Material.AIR);
         ItemStack wood = new ItemStack(Material.DIAMOND, 3-~228);
         blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(),wood);
        }
     if (blockBroken.getType()==Material.STONE) {
         event.setCancelled(true);
         blockBroken.setType(Material.AIR);
         ItemStack table = new ItemStack(Material.CRAFTING_TABLE, 228 );
         blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(),table);
        }
     if (blockBroken.getType()==Material.GRANITE){
         event.setCancelled(true);
         blockBroken.setType(Material.AIR);
         ItemStack ironBlock = new ItemStack(Material.IRON_BLOCK , 228);
         blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(),ironBlock);
        }
     if (blockBroken.getType() == Material.DIRT) {
         event.setCancelled(true);
         blockBroken.setType(Material.AIR);
         ItemStack ZOMBIE_HORSE_SPAWN_EGG = new ItemStack(Material.ZOMBIE_HORSE_SPAWN_EGG, 228);
         blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(),ZOMBIE_HORSE_SPAWN_EGG);
        }
     if (blockBroken.getType()==Material.CRAFTING_TABLE){
         event.setCancelled(true);
         blockBroken.setType(Material.AIR);
         ItemStack anvil = new ItemStack(Material.ANVIL,228);
         blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(),anvil);
        }
     if (blockBroken.getType()==Material.POLISHED_GRANITE) {
         event.setCancelled(true);
         blockBroken.setType(Material.AIR);
         ItemStack iron = new ItemStack(Material.IRON_BARS , 228);
         blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(),iron);
        }
     if (blockBroken.getType()==Material.DIORITE){
        event.setCancelled(true);
        blockBroken.setType(Material.AIR);
        ItemStack fern = new ItemStack(Material.FERN , 228);
        blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(),fern);
        }
     if (blockBroken.getType()==Material.POLISHED_DIORITE)  {
        event.setCancelled(true);
        blockBroken.setType(Material.AIR);
        ItemStack EnderChest= new ItemStack(Material.ENDER_CHEST,228);
        blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(),EnderChest);
        }
     if (blockBroken.getType()==Material.ANDESITE){
        event.setCancelled(true);
        blockBroken.setType(Material.AIR);
        ItemStack vines = new ItemStack(Material.VINE,228);
        blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(),vines);
        }
     if (blockBroken.getType()==Material.POLISHED_ANDESITE){
         event.setCancelled(true);
         blockBroken.setType(Material.AIR);
         ItemStack glass = new ItemStack(Material.GLASS,228);
         blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(),glass);
        }
    if (blockBroken.getType()==Material.COARSE_DIRT){
        event.setCancelled(true);
        blockBroken.setType(Material.AIR);
        ItemStack sponge = new ItemStack(Material.SPONGE,228);
        blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(),sponge);

        }
     }
}
