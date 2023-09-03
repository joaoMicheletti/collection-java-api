package main.java.list.OperacaoBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    //criando array
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    // adicionando elemento ao array
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    //removendo elemento do array
    public void removerTarefa(String descricao){
        //pegando toas as tarefas iguais e salvandoas en uma nova lista para deletar todas.
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //obtendo o número total de tarefs do Array
    public int obterNumeroTotalTarefas(){
        return  tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa(); //intância de ListaTarefa.
        System.out.println("O númmero de elementos é de : " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O númmero de elementos é de : " + listaTarefa.obterNumeroTotalTarefas());

        //listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O númmero de elementos é de : " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
