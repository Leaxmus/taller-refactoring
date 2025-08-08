/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo6.ChoiceStrategies;

import com.grupo6.ChoiceTypes.Choice;

/**
 *
 * @author Bryan
 */
public class BotChoiceStrategy implements ChoiceStrategy{
    @Override
    public Choice choose() {
        return Choice.randomChoice();
    }
}
