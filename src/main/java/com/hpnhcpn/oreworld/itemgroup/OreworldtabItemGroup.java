
package com.hpnhcpn.oreworld.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.hpnhcpn.oreworld.item.OreworldItem;
import com.hpnhcpn.oreworld.OreWorldModElements;

@OreWorldModElements.ModElement.Tag
public class OreworldtabItemGroup extends OreWorldModElements.ModElement {
	public OreworldtabItemGroup(OreWorldModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taboreworldtab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(OreworldItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
