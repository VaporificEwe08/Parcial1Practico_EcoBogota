# Sistema de Información Electoral - Elecciones 2026

Proyecto correspondiente al Parcial Práctico de la asignatura
**Fundamentos de Ingeniería de Software**.

## Objetivo

Diseñar e implementar un sistema orientado a objetos que permita gestionar
información relacionada con el proceso electoral colombiano de 2026,
incluyendo procesos electorales, territorios, puestos de votación, mesas,
partidos políticos, candidatos, jurados, actas, resultados, incidencias
y reclamaciones.

El proyecto busca aplicar conceptos de ingeniería de software como:

- Historias de usuario.
- Criterios de aceptación.
- Gestión de tareas mediante GitHub Issues.
- Planeación mediante Sprints y Milestones.
- Uso de GitHub Projects.
- GitFlow.
- Conventional Commits.
- Diseño orientado a objetos.

---

## Equipo

**Grupo 3**

- Carlos Ney Bernal
- Pablo Alfonso Jimenez Becerra
- Lilian Andrea Chaparro Rodriguez

---

## Historias de usuario

El proyecto fue dividido en 12 historias de usuario:

1. HU-01: Registrar proceso electoral.
2. HU-02: Gestionar territorios electorales.
3. HU-03: Registrar puestos de votación.
4. HU-04: Registrar mesas de votación.
5. HU-05: Registrar partidos políticos.
6. HU-06: Registrar candidatos.
7. HU-07: Registrar jurados de votación.
8. HU-08: Asignar jurados a mesas.
9. HU-09: Registrar acta electoral.
10. HU-10: Registrar resultados de una mesa.
11. HU-11: Registrar incidentes y reclamaciones.
12. HU-12: Consultar y analizar resultados.

Cada historia de usuario fue registrada mediante **GitHub Issues** e incluye
criterios de aceptación, prioridad, estimación, Sprint y responsable.

---

## Planeación del proyecto

El trabajo fue organizado utilizando **GitHub Projects** mediante un tablero
tipo Kanban con los siguientes estados:

- Backlog
- Ready
- In Progress
- In Review
- Done

Las historias de usuario fueron priorizadas y estimadas utilizando
Story Points.

### Sprint 1 - Estructura electoral

- HU-01: Registrar proceso electoral.
- HU-02: Gestionar territorios electorales.
- HU-03: Registrar puestos de votación.
- HU-04: Registrar mesas de votación.

### Sprint 2 - Participantes y asignaciones

- HU-05: Registrar partidos políticos.
- HU-06: Registrar candidatos.
- HU-07: Registrar jurados de votación.
- HU-08: Asignar jurados a mesas.

### Sprint 3 - Resultados y cierre

- HU-09: Registrar acta electoral.
- HU-10: Registrar resultados de una mesa.
- HU-11: Registrar incidentes y reclamaciones.
- HU-12: Consultar y analizar resultados.

Los Sprints también fueron registrados mediante **Milestones** para permitir
el seguimiento del avance del proyecto.

---

## Estructura del proyecto

```text
Parcial1Practico_EcoBogota/
│
├── grupo-3/
│   │
│   ├── docs/
│   │   ├── diagramas/
│   │   │   └── .gitkeep
│   │   │
│   │   ├── evidencias/
│   │   │   └── .gitkeep
│   │   │
│   │   └── roadmap/
│   │       └── .gitkeep
│   │
│   ├── include/
│   │   └── .gitkeep
│   │
│   ├── src/
│   │   ├── Acta.java
│   │   ├── Candidato.java
│   │   ├── Departamento.java
│   │   ├── Incidencia.java
│   │   ├── JuradoVotacion.java
│   │   ├── MesaVotacion.java
│   │   ├── Municipio.java
│   │   ├── PartidoPolitico.java
│   │   ├── ProcesoElectoral.java
│   │   ├── PuestoVotacion.java
│   │   ├── Reclamacion.java
│   │   └── ResultadoCandidato.java
│   │
│   ├── tests/
│   │   └── .gitkeep
│   │
│   └── README.md
│
└── README.md	
