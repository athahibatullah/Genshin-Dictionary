package com.devops.DevOps.entity;

import javax.persistence.*;

@Entity
@Table(name="characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String name;
    private String characterName;
    private String weaponType;
    private String vision;
    private int rarity;
    private String constellation;
    private String nation;
    private String icon;
    private String gachaSplash;
    private String talentNa;
    private String talentSkill;
    private String talentBurst;
    public Character(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getGachaSplash() {
        return gachaSplash;
    }

    public void setGachaSplash(String gachaSplash) {
        this.gachaSplash = gachaSplash;
    }

    public String getTalentNa() {
        return talentNa;
    }

    public void setTalentNa(String talentNa) {
        this.talentNa = talentNa;
    }

    public String getTalentSkill() {
        return talentSkill;
    }

    public void setTalentSkill(String talentSkill) {
        this.talentSkill = talentSkill;
    }

    public String getTalentBurst() {
        return talentBurst;
    }

    public void setTalentBurst(String talentBurst) {
        this.talentBurst = talentBurst;
    }
}