package ecaperoom_hashmap;

import java.util.HashMap;

public class EcapeRoom_HashMap 
{
    public static void main(String[] args) 
    {
        HashMap<String , Personaje> agentes = new HashMap<>();
        
        String[] nombres = {
  "AG-100", "AG-101", "AG-102", "AG-103", "AG-104", "AG-105", "AG-106", "AG-107", "AG-108", "AG-109", "AG-110", "AG-111", "AG-112", "AG-113", "AG-114", "AG-115", "AG-116", "AG-117", "AG-118", "AG-119", "AG-120", "AG-121", "AG-122", "AG-123", "AG-124", "AG-125", "AG-126", "AG-127", "AG-128", "AG-129"
};

String[] tipos = {
  "HACKER", "SABOTEADOR", "SABOTEADOR", "GUARDIAN", "GUARDIAN", "GUARDIAN", "HACKER", "SABOTEADOR", "HACKER", "SABOTEADOR", "SABOTEADOR", "GUARDIAN", "SABOTEADOR", "SABOTEADOR", "SABOTEADOR", "GUARDIAN", "HACKER", "HACKER", "GUARDIAN", "SABOTEADOR", "GUARDIAN", "SABOTEADOR", "GUARDIAN", "HACKER", "HACKER", "HACKER", "HACKER", "SABOTEADOR", "HACKER", "HACKER"
};

int[] niveles = {
  1, 6, 5, 8, 3, 5, 6, 8, 8, 1, 2, 2, 2, 2, 4, 7, 3, 2, 6, 5, 2, 6, 6, 7, 8, 6, 4, 1, 8, 1
};

int[] codigos = {
  354, 115, 906, 823, 422, 255, 524, 994, 739, 946, 876, 690, 765, 663, 524, 718, 562, 810, 739, 280, 777, 376, 148, 847, 908, 754, 108, 772, 544, 658
};

    for(int i = 0; i < nombres.length; i++)
    {
       switch(tipos[i])
       {
           case "HACKER" -> agentes.put(nombres[i], new Hacker(nombres[i], niveles[i], codigos[i]));
           case "GUARDIAN" -> agentes.put(nombres[i], new Guardian(nombres[i], niveles[i], codigos[i]));
           case "SABOTEADOR" -> agentes.put(nombres[i], new Saboteador(nombres[i], niveles[i], codigos[i]));
       }
       
    }
    int semilla = 5;
    
    String clave = nombres[semilla * 3];
    Personaje agente = agentes.get(clave);
    System.out.println(agente.calcularAporte());
    }
}
