
package net.theunknown.tut.block;

import net.theunknown.tut.creativetab.TabTut;
import net.theunknown.tut.ElementsTUT;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@ElementsTUT.ModElement.Tag
public class BlockUranium235Ore extends ElementsTUT.ModElement {
	@GameRegistry.ObjectHolder("tut:uranium235ore")
	public static final Block block = null;
	public BlockUranium235Ore(ElementsTUT instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("uranium235ore"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("tut:uranium235ore", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("uranium235ore");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 3);
			setHardness(3F);
			setResistance(100F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabTut.tab);
		}
	}
}
