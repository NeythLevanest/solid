/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;

/**
 *
 * @author Usuario
 */
public class AttackAire extends Ataque{
    public double porcentDamage=0.8;

    @Override
    double ataque() {
        return porcentDamage;
    }
}
