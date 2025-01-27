package handler

import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.material.properties.*
import gregtech.api.unification.material.Material
import gregtech.api.unification.material.Materials
import gregtech.api.unification.OreDictUnifier
import gregtech.api.recipes.RecipeBuilder
import gregtech.api.recipes.RecipeMaps
import gregtech.api.recipes.GTRecipeHandler
import gregtech.api.util.GTUtility
import gregtech.loaders.recipe.handlers.OreRecipeHandler
import gregtech.core.sound.GTSoundEvents
import gregtech.api.recipes.builders.BlastRecipeBuilder
import gregtech.api.recipes.RecipeMap

import net.minecraft.item.ItemStack
import net.minecraftforge.fluids.FluidStack

import classes.GTHHRecipeMaps

import material.GTHHOrePrefix
import material.GTHHMaterialFlags

import static material.GTHHMaterialFlags.*
import static material.GTHHOrePrefix.*
import static gregtech.api.GTValues.*
import static gregtech.api.unification.ore.OrePrefix.*

class GTHHMaterialRecipeHandler {

    static void register() {
        dust.addProcessingHandler(PropertyKey.BLAST, GTHHMaterialRecipeHandler::processEBFRecipe)
        dust.addProcessingHandler(PropertyKey.BLAST, GTHHMaterialRecipeHandler::processRawMaterial)
    }

    static void processEBFRecipe(OrePrefix dustPrefix, Material material, BlastProperty property) {

        ItemStack circuitMeta1 = item('gregtech:meta_item_1', 461).withNbt(['Configuration': 1])
        ItemStack circuitMeta2 = item('gregtech:meta_item_1', 461).withNbt(['Configuration': 2])
        ItemStack ingotPrefix = OreDictUnifier.get(OrePrefix.ingot, material, 1)
        ItemStack ingotHotPrefix = OreDictUnifier.get(OrePrefix.ingotHot, material, 1)

        int blastTemp = property.getBlastTemperature()
        int duration = property.getDurationOverride()
        int energy = property.getEUtOverride()
        int vacuumEnergy = property.getVacuumEUtOverride() != -1 ? property.getVacuumEUtOverride() : VA[MV]
        int vacuumDuration = property.getVacuumDurationOverride() != -1 ? property.getVacuumDurationOverride() : (int) material.getMass() * 3

        if (duration <= 0) {
            duration = Math.max(1, (int) (material.getMass() * blastTemp / 50L));
        }

        if (energy <= 0) {
            energy = VA[MV]
        }

        if (material.hasFlag(GTHHMaterialFlags.GENERATE_RAW) && blastTemp <= 1750) {

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotPrefix)
            .circuitMeta(1)
            .blastFurnaceTemp(blastTemp)
            .duration(duration).EUt(energy)
            .buildAndRegister()
        
        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotPrefix)
            .fluidInputs(fluid('nitrogen') * 1000)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.90)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotPrefix)
            .fluidInputs(fluid('helium') * 900)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.80)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotPrefix)
            .fluidInputs(fluid('neon') * 800)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.70)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotPrefix)
            .fluidInputs(fluid('argon') * 700)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.60)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotPrefix)
            .fluidInputs(fluid('krypton') * 600)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.50)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotPrefix)
            .fluidInputs(fluid('xenon') * 500)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.40)).EUt(energy)
            .buildAndRegister()

        }else if (material.hasFlag(GTHHMaterialFlags.GENERATE_RAW) && blastTemp > 1750) {

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotHotPrefix)
            .circuitMeta(1)
            .blastFurnaceTemp(blastTemp)
            .duration(duration).EUt(energy)
            .buildAndRegister()
        
        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotHotPrefix)
            .fluidInputs(fluid('nitrogen') * 1000)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.90)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotHotPrefix)
            .fluidInputs(fluid('helium') * 900)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.80)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotHotPrefix)
            .fluidInputs(fluid('neon') * 800)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.70)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotHotPrefix)
            .fluidInputs(fluid('argon') * 700)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.60)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotHotPrefix)
            .fluidInputs(fluid('krypton') * 600)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.50)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .inputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .outputs(ingotHotPrefix)
            .fluidInputs(fluid('xenon') * 500)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.40)).EUt(energy)
            .buildAndRegister()

        } else if (blastTemp <= 1750) {

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotPrefix)
            .circuitMeta(1)
            .blastFurnaceTemp(blastTemp)
            .duration(duration).EUt(energy)
            .buildAndRegister()
        
        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotPrefix)
            .fluidInputs(fluid('nitrogen') * 1000)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.90)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotPrefix)
            .fluidInputs(fluid('helium') * 900)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.80)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotPrefix)
            .fluidInputs(fluid('neon') * 800)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.70)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotPrefix)
            .fluidInputs(fluid('argon') * 700)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.60)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotPrefix)
            .fluidInputs(fluid('krypton') * 600)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.50)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotPrefix)
            .fluidInputs(fluid('xenon') * 500)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.40)).EUt(energy)
            .buildAndRegister()

        } else if (blastTemp > 1750) {

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotHotPrefix)
            .circuitMeta(1)
            .blastFurnaceTemp(blastTemp)
            .duration(duration).EUt(energy)
            .buildAndRegister()
        
        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotHotPrefix)
            .fluidInputs(fluid('nitrogen') * 1000)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.90)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotHotPrefix)
            .fluidInputs(fluid('helium') * 900)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.80)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotHotPrefix)
            .fluidInputs(fluid('neon') * 800)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.70)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotHotPrefix)
            .fluidInputs(fluid('argon') * 700)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.60)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotHotPrefix)
            .fluidInputs(fluid('krypton') * 600)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.50)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_BLAST_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(ingotHotPrefix)
            .fluidInputs(fluid('xenon') * 500)
            .circuitMeta(2)
            .blastFurnaceTemp(blastTemp)
            .duration((int) (duration * 0.40)).EUt(energy)
            .buildAndRegister()

        GTHHRecipeMaps.GTHH_VACUUM_RECIPES.recipeBuilder()
            .input(ingotHot, material, 1)
            .output(ingot, material, 1)
            .duration(vacuumDuration)
            .EUt(vacuumEnergy)
            .buildAndRegister()
        
        }
    }
    static void processRawMaterial(OrePrefix dustPrefix, Material material, BlastProperty property) {

        int blastTemp = property.getBlastTemperature()
        int energy = property.getEUtOverride()
        int duration = property.getDurationOverride()

        if (energy <= 0) {
            energy = VA[MV]
        }

        if (duration <= 0) {
            duration = Math.max(1, (int) (material.getMass() * blastTemp / 50L))
        }
        
        if (material.hasFlag(GTHHMaterialFlags.GENERATE_RAW) && blastTemp <= 1750) {

        RecipeMaps.COMPRESSOR_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .duration(400)
            .EUt(2)
            .buildAndRegister()

        } else if (material.hasFlag(GTHHMaterialFlags.GENERATE_RAW) && blastTemp > 1750) {

        RecipeMaps.IMPLOSION_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .fluidInputs(fluid('plasma.helium') * 125)
            .explosivesType(item('gregtech:powderbarrel') * 64)
            .duration((int) (duration * 0.25))
            .EUt(energy)
            .buildAndRegister()

        RecipeMaps.IMPLOSION_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .fluidInputs(fluid('plasma.helium') * 125)
            .explosivesType(item('minecraft:tnt') * 32)
            .duration((int) (duration * 0.25))
            .EUt(energy)
            .buildAndRegister()

        RecipeMaps.IMPLOSION_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .fluidInputs(fluid('plasma.helium') * 125)
            .explosivesType(item('gregtech:meta_item_1', 460) * 16)
            .duration((int) (duration * 0.25))
            .EUt(energy)
            .buildAndRegister()

        RecipeMaps.IMPLOSION_RECIPES.recipeBuilder()
            .input(dustPrefix, material, 1)
            .outputs(OreDictUnifier.get(GTHHOrePrefix.raw, material, 1))
            .fluidInputs(fluid('plasma.helium') * 125)
            .explosivesType(item('gregtech:itnt') * 8)
            .duration((int) (duration * 0.25))
            .EUt(energy)
            .buildAndRegister()

        }
    }
}