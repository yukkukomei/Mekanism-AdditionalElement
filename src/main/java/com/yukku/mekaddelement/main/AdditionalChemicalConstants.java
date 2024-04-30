package com.yukku.mekaddelement.main;

import mekanism.common.base.IChemicalConstant;

public enum AdditionalChemicalConstants implements IChemicalConstant {
    HELIUM("helium", 0xFFE0F0FF, 0, 4.22F, 124.9F),
    SUPERHEATED_HELIUM("superheated_helium", 0xFFFFDDB5, 0, 2_000F, 124.9F),
    STRONTIUM("strontium", 0xFFFFC1B2, 0, 1050.15F, 2375F),
    YTTRIUM("yttrium", 0xFFCCE5FF, 0, 1799.15F, 4240F);

    private final String name;
    private final int color;
    private final int luminosity;
    private final float temperature;
    private final float density;

    /**
     * @param name        The name of the chemical
     * @param color       Visual color in ARGB format
     * @param luminosity  Luminosity
     * @param temperature Temperature in Kelvin that the chemical exists as a liquid
     * @param density     Density as a liquid in kg/m^3
     */
    AdditionalChemicalConstants(String name, int color, int luminosity, float temperature, float density) {
        this.name = name;
        this.color = color;
        this.luminosity = luminosity;
        this.temperature = temperature;
        this.density = density;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public float getDensity() {
        return density;
    }

    @Override
    public int getLuminosity() {
        return luminosity;
    }
}
