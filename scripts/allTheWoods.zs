
import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;

//Shapeless Recipe Remove
    val shapelessRecipeArray = [
        <biomesoplenty:planks_0>,
        <biomesoplenty:planks_0:1>,
        <biomesoplenty:planks_0:2>,
        <biomesoplenty:planks_0:3>,
        <biomesoplenty:planks_0:4>,
        <biomesoplenty:planks_0:5>,
        <biomesoplenty:planks_0:6>,
        <biomesoplenty:planks_0:7>,
        <biomesoplenty:planks_0:8>,
        <biomesoplenty:planks_0:9>,
        <biomesoplenty:planks_0:10>,
        <biomesoplenty:planks_0:11>,
        <biomesoplenty:planks_0:12>,
        <biomesoplenty:planks_0:13>,
        <biomesoplenty:planks_0:14>,
        <biomesoplenty:planks_0:15>,
        <forestry:planks.0>,
        <forestry:planks.0:1>,
        <forestry:planks.0:2>,
        <forestry:planks.0:3>,
        <forestry:planks.0:4>,
        <forestry:planks.0:5>,
        <forestry:planks.0:6>,
        <forestry:planks.0:7>,
        <forestry:planks.0:8>,
        <forestry:planks.0:9>,
        <forestry:planks.0:10>,
        <forestry:planks.0:11>,
        <forestry:planks.0:12>,
        <forestry:planks.0:13>,
        <forestry:planks.0:14>,
        <forestry:planks.0:15>,
        <forestry:planks.1>,
        <forestry:planks.1:1>,
        <forestry:planks.1:2>,
        <forestry:planks.1:3>,
        <forestry:planks.1:4>,
        <forestry:planks.1:5>,
        <forestry:planks.1:6>,
        <forestry:planks.1:7>,
        <forestry:planks.1:8>,
        <forestry:planks.1:9>,
        <forestry:planks.1:10>,
        <forestry:planks.1:11>,
        <forestry:planks.1:12>
    ]as IIngredient[];
    for output in shapelessRecipeArray{
        recipes.removeShapeless(output);
    }
//Wood Fix Shapeless
    val shapelessWoodFixArray = {
        <biomesoplenty:planks_0> * 2:[<biomesoplenty:log_0:4>],
        <biomesoplenty:planks_0:1> * 2:[<biomesoplenty:log_0:5>],
        <biomesoplenty:planks_0:2> * 2:[<biomesoplenty:log_0:6>],
        <biomesoplenty:planks_0:3> * 2:[<biomesoplenty:log_0:7>],
        <biomesoplenty:planks_0:4> * 2:[<biomesoplenty:log_1:4>],
        <biomesoplenty:planks_0:5> * 2:[<biomesoplenty:log_1:5>],
        <biomesoplenty:planks_0:6> * 2:[<biomesoplenty:log_1:6>],
        <biomesoplenty:planks_0:7> * 2:[<biomesoplenty:log_1:7>],
        <biomesoplenty:planks_0:8> * 2:[<biomesoplenty:log_2:4>],
        <biomesoplenty:planks_0:9> * 2:[<biomesoplenty:log_2:5>],
        <biomesoplenty:planks_0:10> * 2:[<biomesoplenty:log_2:6>],
        <biomesoplenty:planks_0:11> * 2:[<biomesoplenty:log_2:7>],
        <biomesoplenty:planks_0:12> * 2:[<biomesoplenty:log_3:4>],
        <biomesoplenty:planks_0:13> * 2:[<biomesoplenty:log_3:5>],
        <biomesoplenty:planks_0:14> * 2:[<biomesoplenty:log_3:6>],
        <biomesoplenty:planks_0:15> * 2:[<biomesoplenty:log_3:7>],
        <forestry:planks.0> * 2:[<forestry:logs.0>],
        <forestry:planks.0:1> * 2:[<forestry:logs.0:1>],
        <forestry:planks.0:2> * 2:[<forestry:logs.0:2>],
        <forestry:planks.0:3> * 2:[<forestry:logs.0:3>],
        <forestry:planks.0:4> * 2:[<forestry:logs.1>],
        <forestry:planks.0:5> * 2:[<forestry:logs.1:1>],
        <forestry:planks.0:6> * 2:[<forestry:logs.1:2>],
        <forestry:planks.0:7> * 2:[<forestry:logs.1:3>],
        <forestry:planks.0:8> * 2:[<forestry:logs.2>],
        <forestry:planks.0:9> * 2:[<forestry:logs.2:1>],
        <forestry:planks.0:10> * 2:[<forestry:logs.2:2>],
        <forestry:planks.0:11> * 2:[<forestry:logs.2:3>],
        <forestry:planks.0:12> * 2:[<forestry:logs.3>],
        <forestry:planks.0:13> * 2:[<forestry:logs.3:1>],
        <forestry:planks.0:14> * 2:[<forestry:logs.3:2>],
        <forestry:planks.0:15> * 2:[<forestry:logs.3:3>],
        <forestry:planks.1> * 2:[<forestry:logs.4>],
        <forestry:planks.1:1> * 2:[<forestry:logs.4:1>],
        <forestry:planks.1:2> * 2:[<forestry:logs.4:2>],
        <forestry:planks.1:3> * 2:[<forestry:logs.4:3>],
        <forestry:planks.1:4> * 2:[<forestry:logs.5>],
        <forestry:planks.1:5> * 2:[<forestry:logs.5:1>],
        <forestry:planks.1:6> * 2:[<forestry:logs.5:2>],
        <forestry:planks.1:7> * 2:[<forestry:logs.5:3>],
        <forestry:planks.1:8> * 2:[<forestry:logs.6>],
        <forestry:planks.1:9> * 2:[<forestry:logs.6:1>],
        <forestry:planks.1:10> * 2:[<forestry:logs.6:2>],
        <forestry:planks.1:11> * 2:[<forestry:logs.6:3>],
        <forestry:planks.1:12> * 2:[<forestry:logs.7>]
    }as IIngredient[][IItemStack];
    for output, inputs in shapelessWoodFixArray{
        recipes.addShapeless(output, inputs);
    }
//Wood Fix Shaped
    val shapedWoodFixArray = {
        <biomesoplenty:planks_0> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_0:4>, null], [null, null, null]],
        <biomesoplenty:planks_0:1> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_0:5>, null], [null, null, null]],
        <biomesoplenty:planks_0:2> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_0:6>, null], [null, null, null]],
        <biomesoplenty:planks_0:3> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_0:7>, null], [null, null, null]],
        <biomesoplenty:planks_0:4> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_1:4>, null], [null, null, null]],
        <biomesoplenty:planks_0:5> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_1:5>, null], [null, null, null]],
        <biomesoplenty:planks_0:6> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_1:6>, null], [null, null, null]],
        <biomesoplenty:planks_0:7> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_1:7>, null], [null, null, null]],
        <biomesoplenty:planks_0:8> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_2:4>, null], [null, null, null]],
        <biomesoplenty:planks_0:9> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_2:5>, null], [null, null, null]],
        <biomesoplenty:planks_0:10> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_2:6>, null], [null, null, null]],
        <biomesoplenty:planks_0:11> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_2:7>, null], [null, null, null]],
        <biomesoplenty:planks_0:12> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_3:4>, null], [null, null, null]],
        <biomesoplenty:planks_0:13> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_3:5>, null], [null, null, null]],
        <biomesoplenty:planks_0:14> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_3:6>, null], [null, null, null]],
        <biomesoplenty:planks_0:15> * 4:[[null, <ore:craftingToolSaw>, null], [null, <biomesoplenty:log_3:7>, null], [null, null, null]],
        <forestry:planks.0> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.0>, null], [null, null, null]],
        <forestry:planks.0:1> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.0:1>, null], [null, null, null]],
        <forestry:planks.0:2> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.0:2>, null], [null, null, null]],
        <forestry:planks.0:3> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.0:3>, null], [null, null, null]],
        <forestry:planks.0:4> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.1>, null], [null, null, null]],
        <forestry:planks.0:5> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.1:1>, null], [null, null, null]],
        <forestry:planks.0:6> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.1:2>, null], [null, null, null]],
        <forestry:planks.0:7> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.1:3>, null], [null, null, null]],
        <forestry:planks.0:8> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.2>, null], [null, null, null]],
        <forestry:planks.0:9> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.2:1>, null], [null, null, null]],
        <forestry:planks.0:10> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.2:2>, null], [null, null, null]],
        <forestry:planks.0:11> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.2:3>, null], [null, null, null]],
        <forestry:planks.0:12> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.3>, null], [null, null, null]],
        <forestry:planks.0:13> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.3:1>, null], [null, null, null]],
        <forestry:planks.0:14> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.3:2>, null], [null, null, null]],
        <forestry:planks.0:15> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.3:3>, null], [null, null, null]],
        <forestry:planks.1> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.4>, null], [null, null, null]],
        <forestry:planks.1:1> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.4:1>, null], [null, null, null]],
        <forestry:planks.1:2> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.4:2>, null], [null, null, null]],
        <forestry:planks.1:3> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.4:3>, null], [null, null, null]],
        <forestry:planks.1:4> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.5>, null], [null, null, null]],
        <forestry:planks.1:5> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.5:1>, null], [null, null, null]],
        <forestry:planks.1:6> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.5:2>, null], [null, null, null]],
        <forestry:planks.1:7> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.5:3>, null], [null, null, null]],
        <forestry:planks.1:8> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.6>, null], [null, null, null]],
        <forestry:planks.1:9> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.6:1>, null], [null, null, null]],
        <forestry:planks.1:10> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.6:2>, null], [null, null, null]],
        <forestry:planks.1:11> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.6:3>, null], [null, null, null]],
        <forestry:planks.1:12> * 4:[[null, <ore:craftingToolSaw>, null], [null, <forestry:logs.7>, null], [null, null, null]]
    }as IIngredient[][][IItemStack];
    for output, inputs in shapedWoodFixArray{
        recipes.addShaped(output, inputs);
    }