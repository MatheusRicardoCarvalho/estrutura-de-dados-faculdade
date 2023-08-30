/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadados;

/**
 *
 * @author Aluno
 */
public class Lista {
    private Object elementos[];
    int tamanho;
    public Lista(int capacidade){
        elementos = new Object[capacidade];
        this.tamanho = 0;
        
    }
    
    
    public int verificaPos(Object item){
        for(int i = 0; i < tamanho; i++){
            if(this.elementos[i] == item){
                return i;
            }
        }
        return -1;
    }
    
    public String imprime() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();	
    }
    
    public void remove(int pos) {
        if(pos >= 0 && (pos < this.tamanho)){
            for(int i = pos; i < this.tamanho; i++){
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho ++;
        }
    }
    public void adiciona(Object elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
		}else {
			this.aumentaCapacidade();
			this.elementos[this.tamanho] = elemento;
		}
		this.tamanho++;
    }
    
    public void aumentaCapacidade() {
		Object[] elementosNovos = new Object[this.elementos.length*2];
		for(int i=0; i<this.elementos.length; i++) {
			elementosNovos[i] = this.elementos[i];
		}
		this.elementos = elementosNovos;
	}
    
    public void removeItem(Object item){
        int pos = verificaPos(item);
        if( pos > -1){
            remove(pos);
        }
    }
}
