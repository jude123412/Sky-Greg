recipemap('chemical_reactor').recipeBuilder()
    .inputs(metaitem('dustPreciousMetals') * 3)
    .fluidInputs(fluid('aqua_regia') * 3000)
    .fluidOutputs(fluid('dirty_precious_metal_solution') * 3000)
    .duration(80)
    .EUt(32)
    .buildAndRegister()

recipemap('thermal_centrifuge').recipeBuilder()
    .chancedOutput(metaitem('dustGold') * 1, 2500,  500)
    .chancedOutput(metaitem('dustSilver') * 1, 2500,  500)
    .chancedOutput(metaitem('dustCopper') * 1, 2500,  500)
    .fluidInputs(fluid('dirty_precious_metal_solution') * 3000)
    .fluidOutputs(fluid('hydrochloric_acid') * 3000, fluid('nitric_acid') * 1000)
    .duration(160)
    .EUt(16)
    .buildAndRegister()

recipemap('mixer').recipeBuilder()
    .fluidInputs(fluid('dirty_precious_metal_solution') * 3000, fluid('water') * 3000)
    .fluidOutputs(fluid('dilte_precious_metal_solution') * 6000)
    .duration(160)
    .EUt(64)
    .buildAndRegister()

recipemap('sifter').recipeBuilder()
    .chancedOutput(metaitem('dustStone') * 1, 2500,  500)
    .chancedOutput(metaitem('dustZinc') * 1, 2500,  500)
    .chancedOutput(metaitem('dustGallium') * 1, 100,  100)
    .fluidInputs(fluid('dilte_precious_metal_solution') * 1000)
    .fluidOutputs(fluid('clean_precious_metal_solution') * 1000)
    .duration(40)
    .EUt(64)
    .buildAndRegister()

recipemap('distillation_tower').recipeBuilder()
    .fluidInputs(fluid('clean_precious_metal_solution') * 1000)
    .fluidOutputs(fluid('concentrated_precious_metal_solution') * 500, fluid('water') * 500)
    .duration(80)
    .EUt(96)
    .buildAndRegister()

recipemap('thermal_centrifuge').recipeBuilder()
    .outputs(metaitem('dustGold') * 1, metaitem('dustSilver') * 1, metaitem('dustCopper') * 1)
    .fluidInputs(fluid('concentrated_precious_metal_solution') * 3000)
    .fluidOutputs(fluid('hydrochloric_acid') * 3000, fluid('nitric_acid') * 1000)
    .duration(160)
    .EUt(64)
    .buildAndRegister()