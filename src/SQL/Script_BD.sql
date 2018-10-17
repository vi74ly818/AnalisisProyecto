/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Pepe
 * Created: 17/10/2018
 */

CREATE TABLE cancion (
    id            NUMBER NOT NULL,
    nombre        VARCHAR2(100 CHAR) NOT NULL,
    duracion      NUMBER NOT NULL,
    lanzamiento   DATE NOT NULL
);

ALTER TABLE cancion ADD CONSTRAINT cancion_pk PRIMARY KEY ( id );

CREATE TABLE tiempos_medidos (
    id                  NUMBER NOT NULL,
    tipo_dato           VARCHAR2(100 CHAR) NOT NULL,
    metodo_estructura   VARCHAR2(100 CHAR) NOT NULL,
    cantidad_datos      NUMBER NOT NULL,
    tiempo_medido       NUMBER NOT NULL
);

ALTER TABLE tiempos_medidos ADD CONSTRAINT tiempos_medidos_pk PRIMARY KEY ( id );


-- metodo encargado de generar el millon de datos, solo es ejecutarlo, obviamente
-- despues de crear las tablas, no se preocupen si sale error, igual hagan un select
-- preguntando el id 1000000. 
DECLARE
    V_ID CANCION.ID%TYPE;
    V_NOMBRE CANCION.NOMBRE%TYPE;
    V_DURACION CANCION.DURACION%TYPE;
    V_LANZAMIENTO CANCION.LANZAMIENTO%TYPE;
BEGIN
    V_ID := 0;
    FOR I IN 1..1000000 LOOP
        V_ID := V_ID + 1;
        V_DURACION := DBMS_RANDOM.VALUE(30, 150000);
        V_NOMBRE := DBMS_RANDOM.STRING('u', 28);
        SELECT TO_DATE(
            TRUNC( DBMS_RANDOM.VALUE(TO_CHAR(DATE '1020-01-01', 'J'), TO_CHAR(DATE '4000-01-01', 'J'))), 'J' ) 
        INTO V_LANZAMIENTO FROM DUAL;
        INSERT INTO CANCION(ID, NOMBRE, DURACION, LANZAMIENTO) VALUES (V_ID, V_NOMBRE, V_DURACION, V_LANZAMIENTO);
    END LOOP;
END;

-- pruebas
select * from cancion where id = 1000000;
select count(id) as cantidadDatos from cancion;
