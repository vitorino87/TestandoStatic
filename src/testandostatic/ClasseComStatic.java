/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandostatic;

/**
 *
 * @author tiago.lucas
 */
public class ClasseComStatic {
    /*
    detalhe técnico, independente de você instanciar ou não a classe "ClasseCom
    Static" será possível resgatar os valores das variáveis a e b. 
    Logo, essas variaveis ocupam espaço na memória quando o programa está 
    rodando, independente você instanciar a classe ou não.
    */
    static int a = 0;
    static String b = "tiago";
}
