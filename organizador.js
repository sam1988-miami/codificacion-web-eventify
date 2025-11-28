class Organizador {

      #dashboard;

    constructor(nombre_organizador) {
        this.nombre_organizador = nombre_organizador; 
        this.#dashboard = [];
    }

   
    ingresarAlSistema(usuario, clave) {
       
        console.log("ingresaando como organizador ...");
        return true;
    }

    
    crearEvento(nombre, fecha_evento, lugar_evento) {
        const evento = { nombre, fecha_evento, lugar_evento };
        console.log("Evento creado:", evento);
        this.#dashboard.push(evento);
        return evento;
    }
    
}

    #validarTicketQR(qrCode) 
        console.log(Validando );
        return qrCode === "VALIDO";
    

   
    personalizarPagina(tema, colores) 
        console.log(Página );
        return { tema, colores };
    

    
    #ingresarDashboard() 
        console.log("Accediendo al dashboard...");
        return this.#dashboard;
    

    #comunicarseConAsistentes(mensaje) 
        console.log("Enviando mensaje a asistentes:", mensaje);
    }
    usarFuncionesPrivadas(qr, mensaje) 
    
        this.#validarTicketQR(qr);
        this.#ingresarDashboard();
        this.#comunicarseConAsistentes(mensaje);
    









