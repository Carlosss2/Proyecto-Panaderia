package org.bryan_chanona.panaderiaproyect.models;

import java.util.ArrayList;

public class Panaderia {
    private Integer totalPanaYema;
    private Integer totalChorizo;
    private Integer totalPanMicropan;
    private Integer totalPanBienmesabe;
    private Integer totalRosquillaSimple;
    private Integer totalRosquillaMatizada;
    private Integer totalBolillo;
    private Integer totalZisote;
    private Integer totalHigo;
    private Integer totalMaleta;
    private Integer totalCazueleja;
    private Integer totalEmpanada;




    public void sumarPanesYema (Integer cantidad){

        totalPanaYema = totalPanaYema + cantidad;
    }
    public Integer getTotalPanaYema() {
        return totalPanaYema;
    }
    public void sumarPanesChorizo(Integer cantidad){
        totalChorizo = totalChorizo+ cantidad;
    }

    public Integer getTotalChorizo() {
        return totalChorizo;
    }
    public void sumarMicroPan(Integer cantidad){
        totalPanMicropan = totalPanMicropan + cantidad;

    }
    public Integer getTotalPanMicropan() {
        return totalPanMicropan;
    }

    public void sumarPanesBienmesabe(Integer cantidad){
        totalPanBienmesabe = totalPanBienmesabe + cantidad;
    }

    public Integer getTotalPanBienmesabe() {
        return totalPanBienmesabe;
    }
    public void sumarPanesRosquillaSimple(Integer cantidad){
        totalRosquillaSimple = totalRosquillaSimple+cantidad;
    }

    public Integer getTotalRosquillaSimple() {
        return totalRosquillaSimple;
    }
    public void sumarRosquillaMatizada(Integer cantidad){
        totalRosquillaMatizada = totalRosquillaMatizada + cantidad;

    }

    public Integer getTotalRosquillaMatizada() {
        return totalRosquillaMatizada;
    }
    public void sumarBolillo(Integer cantidad){
        totalBolillo = totalBolillo + cantidad;
    }

    public Integer getTotalBolillo() {
        return totalBolillo;
    }
    public void sumarZisote(Integer cantidad) {
        totalZisote = totalZisote + cantidad;
    }

    public Integer getTotalZisote() {
        return totalZisote;
    }

    public void sumarHigo(Integer cantidad) {
        totalHigo = totalHigo + cantidad;

    }

    public Integer getTotalHigo() {
        return totalHigo;
    }

    public void sumarMaleta(Integer cantidad) {
        totalMaleta = totalMaleta + cantidad;
    }

    public Integer getTotalMaleta() {
        return totalMaleta;
    }

    public void sumarCazueleja(Integer cantidad) {
        totalCazueleja = totalCazueleja+ cantidad;

    }

    public Integer getTotalCazueleja() {
        return totalCazueleja;
    }

    public void sumarEmpanada(Integer cantidad){
        totalEmpanada = totalEmpanada + cantidad;

    }

    public Integer getTotalEmpanada() {
        return totalEmpanada;
    }

    ArrayList<Pan> Panes=new ArrayList<>();

    public ArrayList<Pan> getPanes() {
        return Panes;
    }
    public boolean addPan(Pan pan ){
        return Panes.add(pan);
    }

    ArrayList<Usuario> empleados=new ArrayList<>();

    public ArrayList<Usuario> getEmpleados() {
        return empleados;
    }
    public boolean addEmpleado(Usuario usuario){
        return empleados.add(usuario);
    }

    @Override
    public String toString() {
        return "Panaderia{" +

                " empleados=" + empleados +
                '}';
    }
}
