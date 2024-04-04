package org.bryan_chanona.panaderiaproyect.models;

import org.bryan_chanona.panaderiaproyect.App;

import java.util.ArrayList;

public class Panaderia {
    private Integer totalPanYema =0;
    private Integer totalChorizo=0;
    private Integer totalPanMicropan=0;
    private Integer totalPanBienmesabe=0;
    private Integer totalRosquillaSimple=0;
    private Integer totalRosquillaMatizada=0;
    private Integer totalBolillo=0;
    private Integer totalZisote=0;
    private Integer totalHigo=0;
    private Integer totalMaleta=0;
    private Integer totalCazueleja=0;
    private Integer totalEmpanada=0;
    public void sumarPanesYema (Integer cantidadYema){
        totalPanYema = totalPanYema + cantidadYema;
    }
    public Integer getTotalPanYema() {
        return totalPanYema;
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


}
