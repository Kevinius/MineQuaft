package de.kevin.draconic.inventorys;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class XtremeCraftingInventory implements Listener {

    public Inventory xtremeCraftingInventory;

    ItemStack loadLightBlue = ItemStackFactory.getInstance().getLoadLightBlue();
    ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackround();
    ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();

    ItemStack xtremeCraftingTablet = ItemStackFactory.getInstance().createCraftingTablets(Material.KNOWLEDGE_BOOK,
            "§6Xtreme Quafting Tablet", "§7Just a bigger crafting table(t) (^._.^)");

    private final String xcname = "§3Xtreme Quafting";

    public void createXtremeCraftingInventory(Player player) {
        xtremeCraftingInventory = Bukkit.createInventory(null, 9*5, xcname);

        ItemStack llb = loadLightBlue;
        ItemStack lb = loadBackground;
        ItemStack fl = fillItem;
        ItemStack rb = resultBarrier;

        llb.setAmount(1);
        lb.setAmount(1);
        fl.setAmount(1);
        rb.setAmount(1);

        //===================== 1 =====================

        xtremeCraftingInventory.setItem(5, llb);
        xtremeCraftingInventory.setItem(6, lb);
        xtremeCraftingInventory.setItem(7, llb);
        xtremeCraftingInventory.setItem(8, fl);

        //===================== 2 =====================

        xtremeCraftingInventory.setItem(14, fl);
        xtremeCraftingInventory.setItem(15, fl);
        xtremeCraftingInventory.setItem(16, lb);
        xtremeCraftingInventory.setItem(17, fl);

        //===================== 3 =====================

        xtremeCraftingInventory.setItem(23, fl);
        xtremeCraftingInventory.setItem(24, fl);
        xtremeCraftingInventory.setItem(25, rb);
        xtremeCraftingInventory.setItem(26, fl);

        //===================== 4 =====================

        xtremeCraftingInventory.setItem(32, fl);
        xtremeCraftingInventory.setItem(33, fl);
        xtremeCraftingInventory.setItem(34, lb);
        xtremeCraftingInventory.setItem(35, fl);

        //===================== 5 =====================

        xtremeCraftingInventory.setItem(41, llb);
        xtremeCraftingInventory.setItem(42, lb);
        xtremeCraftingInventory.setItem(43, llb);
        xtremeCraftingInventory.setItem(44, fl);

        //==================== END =====================

        player.openInventory(xtremeCraftingInventory);
    }

    @EventHandler
    public void openInventory(PlayerInteractEvent event) {

        Player player = event.getPlayer();

        if(event.getAction() == Action.RIGHT_CLICK_AIR) {
            if(event.getItem().isSimilar(xtremeCraftingTablet)) {
                createXtremeCraftingInventory(player);
            }
        }
    }

    @EventHandler
    public void noTakingItems(InventoryClickEvent event) {
        if(event.getClickedInventory() != null) {
            if(event.getClickedInventory().equals(xtremeCraftingInventory)) {
                Bukkit.getServer().getScheduler().runTaskLater(Main.getPlugin(), () -> {
                    if(event.getWhoClicked().getOpenInventory().getItem(25) == null) {
                        event.getWhoClicked().getOpenInventory().setItem(25, resultBarrier);
                    }
                }, 1);
            }
        }

        if(xtremeCraftingInventory != null) {
            if(event.getView().getTitle().equals(xcname)) {
                if(event.getCurrentItem() != null) {
                    event.getClick();
                    if(event.isLeftClick() && event.getCurrentItem().isSimilar(fillItem)
                            || event.isRightClick() && event.getCurrentItem().isSimilar(fillItem)
                            || event.isShiftClick() && event.getCurrentItem().isSimilar(fillItem)

                            || event.isRightClick() && event.getCurrentItem().isSimilar(loadBackground)
                            || event.isLeftClick() && event.getCurrentItem().isSimilar(loadBackground)
                            || event.isShiftClick() && event.getCurrentItem().isSimilar(loadBackground)

                            || event.isShiftClick() && event.getCurrentItem().isSimilar(resultBarrier)
                            || event.isRightClick() && event.getCurrentItem().isSimilar(resultBarrier)
                            || event.isLeftClick() && event.getCurrentItem().isSimilar(resultBarrier)

                            || event.isShiftClick() && event.getCurrentItem().isSimilar(loadLightBlue)
                            || event.isRightClick() && event.getCurrentItem().isSimilar(loadLightBlue)
                            || event.isLeftClick() && event.getCurrentItem().isSimilar(loadLightBlue)

                            || event.getClick().equals(ClickType.DROP)) {
                        event.setCancelled(true);
                    }
                }
            }
        }
    }

    //======================== GETTER & SETTER ===========================

    public Inventory getXtremeCraftingInventory() {
        return xtremeCraftingInventory;
    }

    @EventHandler
    public void closeXtremeCraftingInventory(InventoryCloseEvent event) {
        HumanEntity player = event.getPlayer();

        //Gives the items back to the player when inventory is closed

        if(player.getOpenInventory().getTopInventory() == xtremeCraftingInventory) {

            //================================= 1 ===========================================

            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(0) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(0));
                }
            } else if(player.getOpenInventory().getItem(0) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(0)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(1) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(1));
                }
            } else if(player.getOpenInventory().getItem(1) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(1)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(2) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(2));
                }
            } else if(player.getOpenInventory().getItem(2) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(2)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(3) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(3));
                }
            } else if(player.getOpenInventory().getItem(3) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(3)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(4) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(4));
                }
            } else if(player.getOpenInventory().getItem(4) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(4)));
            }

            //================================= 2 ===========================================

            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(9) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(9));
                }
            } else if(player.getOpenInventory().getItem(9) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(9)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(10) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(10));
                }
            } else if(player.getOpenInventory().getItem(10) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(10)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(11) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(11));
                }
            } else if(player.getOpenInventory().getItem(11) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(11)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(12) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(12));
                }
            } else if(player.getOpenInventory().getItem(12) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(12)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(13) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(13));
                }
            } else if(player.getOpenInventory().getItem(13) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(13)));
            }

            //================================= 3 ===========================================

            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(18) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(18));
                }
            } else if(player.getOpenInventory().getItem(18) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(18)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(19) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(19));
                }
            } else if(player.getOpenInventory().getItem(19) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(19)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(20) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(20));
                }
            } else if(player.getOpenInventory().getItem(20) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(20)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(21) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(21));
                }
            } else if(player.getOpenInventory().getItem(21) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(21)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(22) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(22));
                }
            } else if(player.getOpenInventory().getItem(22) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(22)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(25) != null &&
                   !player.getOpenInventory().getItem(25).isSimilar(resultBarrier)) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(25));
                }
            } else if(player.getOpenInventory().getItem(25) != null &&
                    !player.getOpenInventory().getItem(25).isSimilar(resultBarrier)) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(25)));
            }

            //================================= 4 ===========================================

            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(27) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(27));
                }
            } else if(player.getOpenInventory().getItem(27) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(27)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(28) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(28));
                }
            } else if(player.getOpenInventory().getItem(28) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(28)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(29) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(29));
                }
            } else if(player.getOpenInventory().getItem(29) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(29)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(30) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(30));
                }
            } else if(player.getOpenInventory().getItem(30) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(30)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(31) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(31));
                }
            } else if(player.getOpenInventory().getItem(31) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(31)));
            }

            //================================= 5 ===========================================

            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(36) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(36));
                }
            } else if(player.getOpenInventory().getItem(36) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(36)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(37) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(37));
                }
            } else if(player.getOpenInventory().getItem(37) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(37)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(38) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(38));
                }
            } else if(player.getOpenInventory().getItem(38) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(38)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(39) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(39));
                }
            } else if(player.getOpenInventory().getItem(39) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(39)));
            }
            if(player.getInventory().firstEmpty() != -1) {
                if(player.getOpenInventory().getItem(40) != null) {
                    player.getInventory().addItem(player.getOpenInventory().getItem(40));
                }
            } else if(player.getOpenInventory().getItem(40) != null) {
                player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(40)));
            }
        }
    }
}
