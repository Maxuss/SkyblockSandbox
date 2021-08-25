package com.prince.skyblocksandbox.skyblockabilities

enum class AbilityTypes(private var ability:ItemAbility?=null){
    AOTE(AoteAbility),
    WITHER_IMPACT(WitherImpact),
    JUJUSHORTBOW(JujuShortbowAbility),
    TERMSHORTBOW(TermShortbowAbility),
    SALVATION(SalvationAbility),
    GIANTSSLAM(GiantSwordAbility),
    TERRAINTOSS(YetiSwordAbility),
    AOTSTHROW(AotsThrowAbility),
    AOTSLORE(AotsLoreAbility),
    MOLTENWAVE(MoltenWaveAbility),
    BONEMERANG(BonemerangAbility),
    SPEEDBOOST(SpeedBoostAbility),
    ETHERTRANSMISSION(EtherTransmissionAbility)
    ,NONE;
    fun getAbility() : ItemAbility{
        return ability!!
    }
}