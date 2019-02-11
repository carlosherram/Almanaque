package com.generic.eo.almanaque.Modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class MainMenu implements Serializable {

    @SerializedName("ability")
    @Expose
    private String ability;
    @SerializedName("berry")
    @Expose
    private String berry;
    @SerializedName("berry-firmness")
    @Expose
    private String berryFirmness;
    @SerializedName("berry-flavor")
    @Expose
    private String berryFlavor;
    @SerializedName("characteristic")
    @Expose
    private String characteristic;
    @SerializedName("contest-effect")
    @Expose
    private String contestEffect;
    @SerializedName("contest-type")
    @Expose
    private String contestType;
    @SerializedName("egg-group")
    @Expose
    private String eggGroup;
    @SerializedName("encounter-condition")
    @Expose
    private String encounterCondition;
    @SerializedName("encounter-condition-value")
    @Expose
    private String encounterConditionValue;
    @SerializedName("encounter-method")
    @Expose
    private String encounterMethod;
    @SerializedName("evolution-chain")
    @Expose
    private String evolutionChain;
    @SerializedName("evolution-trigger")
    @Expose
    private String evolutionTrigger;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("generation")
    @Expose
    private String generation;
    @SerializedName("growth-rate")
    @Expose
    private String growthRate;
    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("item-attribute")
    @Expose
    private String itemAttribute;
    @SerializedName("item-category")
    @Expose
    private String itemCategory;
    @SerializedName("item-fling-effect")
    @Expose
    private String itemFlingEffect;
    @SerializedName("item-pocket")
    @Expose
    private String itemPocket;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("location-area")
    @Expose
    private String locationArea;
    @SerializedName("machine")
    @Expose
    private String machine;
    @SerializedName("move")
    @Expose
    private String move;
    @SerializedName("move-ailment")
    @Expose
    private String moveAilment;
    @SerializedName("move-battle-style")
    @Expose
    private String moveBattleStyle;
    @SerializedName("move-category")
    @Expose
    private String moveCategory;
    @SerializedName("move-damage-class")
    @Expose
    private String moveDamageClass;
    @SerializedName("move-learn-method")
    @Expose
    private String moveLearnMethod;
    @SerializedName("move-target")
    @Expose
    private String moveTarget;
    @SerializedName("nature")
    @Expose
    private String nature;
    @SerializedName("pal-park-area")
    @Expose
    private String palParkArea;
    @SerializedName("pokeathlon-stat")
    @Expose
    private String pokeathlonStat;
    @SerializedName("pokedex")
    @Expose
    private String pokedex;
    @SerializedName("pokemon")
    @Expose
    private String pokemon;
    @SerializedName("pokemon-color")
    @Expose
    private String pokemonColor;
    @SerializedName("pokemon-form")
    @Expose
    private String pokemonForm;
    @SerializedName("pokemon-habitat")
    @Expose
    private String pokemonHabitat;
    @SerializedName("pokemon-shape")
    @Expose
    private String pokemonShape;
    @SerializedName("pokemon-species")
    @Expose
    private String pokemonSpecies;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("stat")
    @Expose
    private String stat;
    @SerializedName("super-contest-effect")
    @Expose
    private String superContestEffect;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("version-group")
    @Expose
    private String versionGroup;

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getBerry() {
        return berry;
    }

    public void setBerry(String berry) {
        this.berry = berry;
    }

    public String getBerryFirmness() {
        return berryFirmness;
    }

    public void setBerryFirmness(String berryFirmness) {
        this.berryFirmness = berryFirmness;
    }

    public String getBerryFlavor() {
        return berryFlavor;
    }

    public void setBerryFlavor(String berryFlavor) {
        this.berryFlavor = berryFlavor;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getContestEffect() {
        return contestEffect;
    }

    public void setContestEffect(String contestEffect) {
        this.contestEffect = contestEffect;
    }

    public String getContestType() {
        return contestType;
    }

    public void setContestType(String contestType) {
        this.contestType = contestType;
    }

    public String getEggGroup() {
        return eggGroup;
    }

    public void setEggGroup(String eggGroup) {
        this.eggGroup = eggGroup;
    }

    public String getEncounterCondition() {
        return encounterCondition;
    }

    public void setEncounterCondition(String encounterCondition) {
        this.encounterCondition = encounterCondition;
    }

    public String getEncounterConditionValue() {
        return encounterConditionValue;
    }

    public void setEncounterConditionValue(String encounterConditionValue) {
        this.encounterConditionValue = encounterConditionValue;
    }

    public String getEncounterMethod() {
        return encounterMethod;
    }

    public void setEncounterMethod(String encounterMethod) {
        this.encounterMethod = encounterMethod;
    }

    public String getEvolutionChain() {
        return evolutionChain;
    }

    public void setEvolutionChain(String evolutionChain) {
        this.evolutionChain = evolutionChain;
    }

    public String getEvolutionTrigger() {
        return evolutionTrigger;
    }

    public void setEvolutionTrigger(String evolutionTrigger) {
        this.evolutionTrigger = evolutionTrigger;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(String growthRate) {
        this.growthRate = growthRate;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemAttribute() {
        return itemAttribute;
    }

    public void setItemAttribute(String itemAttribute) {
        this.itemAttribute = itemAttribute;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemFlingEffect() {
        return itemFlingEffect;
    }

    public void setItemFlingEffect(String itemFlingEffect) {
        this.itemFlingEffect = itemFlingEffect;
    }

    public String getItemPocket() {
        return itemPocket;
    }

    public void setItemPocket(String itemPocket) {
        this.itemPocket = itemPocket;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(String locationArea) {
        this.locationArea = locationArea;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String getMoveAilment() {
        return moveAilment;
    }

    public void setMoveAilment(String moveAilment) {
        this.moveAilment = moveAilment;
    }

    public String getMoveBattleStyle() {
        return moveBattleStyle;
    }

    public void setMoveBattleStyle(String moveBattleStyle) {
        this.moveBattleStyle = moveBattleStyle;
    }

    public String getMoveCategory() {
        return moveCategory;
    }

    public void setMoveCategory(String moveCategory) {
        this.moveCategory = moveCategory;
    }

    public String getMoveDamageClass() {
        return moveDamageClass;
    }

    public void setMoveDamageClass(String moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
    }

    public String getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(String moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public String getMoveTarget() {
        return moveTarget;
    }

    public void setMoveTarget(String moveTarget) {
        this.moveTarget = moveTarget;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getPalParkArea() {
        return palParkArea;
    }

    public void setPalParkArea(String palParkArea) {
        this.palParkArea = palParkArea;
    }

    public String getPokeathlonStat() {
        return pokeathlonStat;
    }

    public void setPokeathlonStat(String pokeathlonStat) {
        this.pokeathlonStat = pokeathlonStat;
    }

    public String getPokedex() {
        return pokedex;
    }

    public void setPokedex(String pokedex) {
        this.pokedex = pokedex;
    }

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public String getPokemonColor() {
        return pokemonColor;
    }

    public void setPokemonColor(String pokemonColor) {
        this.pokemonColor = pokemonColor;
    }

    public String getPokemonForm() {
        return pokemonForm;
    }

    public void setPokemonForm(String pokemonForm) {
        this.pokemonForm = pokemonForm;
    }

    public String getPokemonHabitat() {
        return pokemonHabitat;
    }

    public void setPokemonHabitat(String pokemonHabitat) {
        this.pokemonHabitat = pokemonHabitat;
    }

    public String getPokemonShape() {
        return pokemonShape;
    }

    public void setPokemonShape(String pokemonShape) {
        this.pokemonShape = pokemonShape;
    }

    public String getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(String pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getSuperContestEffect() {
        return superContestEffect;
    }

    public void setSuperContestEffect(String superContestEffect) {
        this.superContestEffect = superContestEffect;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(String versionGroup) {
        this.versionGroup = versionGroup;
    }

    private String[] getHeaders() {

        return new String[]{
                // region Nombres
                "ability",
                "berry",
                "berryFirmness",
                "berryFlavor",
                "characteristic",
                "contestEffect",
                "contestType",
                "eggGroup",
                "encounterCondition",
                "encounterConditionValue",
                "encounterMethod",
                "evolutionChain",
                "evolutionTrigger",
                "gender",
                "generation",
                "growthRate",
                "item",
                "itemAttribute",
                "itemCategory",
                "itemFlingEffect",
                "itemPocket",
                "language",
                "location",
                "locationArea",
                "machine",
                "move",
                "moveAilment",
                "moveBattleStyle",
                "moveCategory",
                "moveDamageClass",
                "moveLearnMethod",
                "moveTarget",
                "nature",
                "palParkArea",
                "pokeathlonStat",
                "pokedex",
                "pokemon",
                "pokemonColor",
                "pokemonForm",
                "pokemonHabitat",
                "pokemonShape",
                "pokemonSpecies",
                "region",
                "stat",
                "superContestEffect",
                "type",
                "version",
                "versionGroup"
                // endregion
        };

    }

    public String[] getValues() {

        return new String[]{
                // region Valores
                ability,
                berry,
                berryFirmness,
                berryFlavor,
                characteristic,
                contestEffect,
                contestType,
                eggGroup,
                encounterCondition,
                encounterConditionValue,
                encounterMethod,
                evolutionChain,
                evolutionTrigger,
                gender,
                generation,
                growthRate,
                item,
                itemAttribute,
                itemCategory,
                itemFlingEffect,
                itemPocket,
                language,
                location,
                locationArea,
                machine,
                move,
                moveAilment,
                moveBattleStyle,
                moveCategory,
                moveDamageClass,
                moveLearnMethod,
                moveTarget,
                nature,
                palParkArea,
                pokeathlonStat,
                pokedex,
                pokemon,
                pokemonColor,
                pokemonForm,
                pokemonHabitat,
                pokemonShape,
                pokemonSpecies,
                region,
                stat,
                superContestEffect,
                type,
                version,
                versionGroup
                // endregion
        };

    }

    public ArrayList<ListItem> getListaItems() {

        String[] nombre = getHeaders();

        String[] valor = getValues();

        ArrayList<ListItem> salida = new ArrayList<>();

        for (int i = 0; i < nombre.length; i++) {

            salida.add(new ListItem(nombre[i], valor[i]));

        }

        return salida;

    }

    public void print() {

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Imprimiendo la lista de items en la consulta");

        ArrayList<ListItem> listItems = getListaItems();

        for (int i = 0; i < listItems.size(); i++) {

            listItems.get(i).print();

        }

        System.out.println("--------------------------------------------------------------------------");

    }
}