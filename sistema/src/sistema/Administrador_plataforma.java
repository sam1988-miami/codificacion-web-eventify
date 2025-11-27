
package sistema;

public class Administrador_plataforma {
    String personalizar_pagina;
    String ingreso_dashboard;
    String ingreso_sistema;
    String gestion_evento;
    String aprobar_evento;
    String resolucion_problemas;

    public String getPersonalizar_pagina() {
        return personalizar_pagina;
    }

    public void setPersonalizar_pagina(String personalizar_pagina) {
        this.personalizar_pagina = personalizar_pagina;
    }

    protected String getIngreso_dashboard() {
        return ingreso_dashboard;
    }

    protected void setIngreso_dashboard(String ingreso_dashboard) {
        this.ingreso_dashboard = ingreso_dashboard;
    }

    public String getIngreso_sistema() {
        return ingreso_sistema;
    }

    private void setIngreso_sistema(String ingreso_sistema) {
        this.ingreso_sistema = ingreso_sistema;
    }

    protected String getGestion_evento() {
        return gestion_evento;
    }

    protected void setGestion_evento(String gestion_evento) {
        this.gestion_evento = gestion_evento;
    }

    public String getAprobar_evento() {
        return aprobar_evento;
    }

    public void setAprobar_evento(String aprobar_evento) {
        this.aprobar_evento = aprobar_evento;
    }

    public String getResolucion_problemas() {
        return resolucion_problemas;
    }

    public void setResolucion_problemas(String resolucion_problemas) {
        this.resolucion_problemas = resolucion_problemas;
    }

    public Administrador_plataforma(String personalizar_pagina, String ingreso_dashboard, String ingreso_sistema, String gestion_evento, String aprobar_evento, String resolucion_problemas) {
        this.personalizar_pagina = personalizar_pagina;
        this.ingreso_dashboard = ingreso_dashboard;
        this.ingreso_sistema = ingreso_sistema;
        this.gestion_evento = gestion_evento;
        this.aprobar_evento = aprobar_evento;
        this.resolucion_problemas = resolucion_problemas;
    }
    }

    

   