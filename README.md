# My-Home-SPA

<img width="150" height="150" alt="MYHOUSE" src="https://github.com/user-attachments/assets/aa250820-f0d1-4f04-8683-10200525869e" /><?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="100%" height="100%" viewBox="0 0 2000 2000" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xml:space="preserve" xmlns:serif="http://www.serif.com/" style="fill-rule:evenodd;clip-rule:evenodd;stroke-linecap:round;stroke-linejoin:round;stroke-miterlimit:1.5;">
    <g transform="matrix(1,0,0,1,0,57.832382)">
        <path d="M1349.988,826.376L1349.988,1309.716C1349.988,1324.536 1334.306,1336.568 1314.99,1336.568L685.01,1336.568C665.694,1336.568 650.012,1324.536 650.012,1309.716L650.012,826.376C650.012,811.556 665.694,799.524 685.01,799.524L1314.99,799.524C1334.306,799.524 1349.988,811.556 1349.988,826.376ZM756.612,555.093C761.75,548.822 770.165,546.273 777.919,548.639L1385.698,734.095C1395.173,736.986 1401.104,746.377 1399.642,756.175C1398.181,765.973 1389.767,773.224 1379.861,773.224L620.138,773.224C612.407,773.224 605.369,768.769 602.061,761.783C598.753,754.796 599.768,746.529 604.667,740.549L756.612,555.093Z" style="stroke:black;stroke-width:1px;"/>
    </g>
    <g transform="matrix(1.2,0,0,1.09864,-240.812894,-157.879508)">
        <path d="M1034.01,1064.346C1060.735,1000 1114.184,1000 1140.909,1032.173C1167.635,1064.346 1167.635,1128.692 1140.909,1193.039C1122.202,1241.298 1074.097,1289.558 1034.01,1321.731C993.923,1289.558 945.819,1241.298 927.112,1193.039C900.387,1128.692 900.387,1064.346 927.112,1032.173C953.837,1000 1007.286,1000 1034.01,1064.346Z" style="fill:white;stroke:white;stroke-width:0.87px;"/>
    </g>
</svg>



Se desea desarrollar un software para una empresa de gestión inmobiliaria (MyHome SPA). La empresa
recibe inmuebles que los propietarios entregan para la venta y/o en arriendo. Esta información se encuentra
actualmente en fichas dependiendo del tipo de inmueble a ofrecer. Los inmuebles se clasifican en 3 tipos:
vivienda usada o nueva (casa o departamento), local comercial y bodega. El registro tiene por objetivo
mantener un orden del arriendo y venta de inmuebles, pero además permiten conocer cuales se arriendan o
venden mas.

La agencia posee varias oficinas identificadas que tienen un Gerente de Oficina y Agentes de Venta. La ficha
del inmueble se registra en la oficina donde el propietario ha contactado para ofrecer el inmueble sea en
venta o en arriendo. Actualmente, para compartir esta información se consulta telefónicamente entre oficinas.
De todos los tipos de inmueble se desea conocer la superficie en m2 construidos, valor de tasación y la
dirección completa. Para las viviendas se quiere conocer cuántas habitaciones, baños y cocinas posee
además de sus características especificas: si tiene red de gas, puerta blindada, tipo de piso, etc. De los
locales comerciales y de las bodegas sólo se quiere conocer sus características: número de puertas de
acceso, si tiene ventanas, si está acondicionado o es planta libre.

Los inmuebles pueden ofrecerse para venta, arriendo, o ambos. En cualquier caso, se desea conocer el
precio.
Un propietario cuando entrega un inmueble a la inmobiliaria, firma un contrato donde quedan estipulados los
siguientes datos: fecha del contrato, nombre completo, teléfonos de contacto (hasta 3), el Rut del propietario
y plazo del contrato. A cada inmueble se le asigna un número único de referencia. El cliente debe cancelar un
monto del 0.5 % del valor de tasación del inmueble por concepto de exclusividad y por lo cual recibe una
Factura.

Los clientes interesados en algún inmueble que ofrece la inmobiliaria deben contactar a una oficina y solicitar
una visita. Cada visita debe ser acompañada por un agente de la oficina correspondiente. Para cada
inmueble se deben anotar las visitas que se han realizado, esto incluye la fecha y cliente y un comentario
sobre la impresión que ha manifestado el cliente al respecto. Es importante registrar los datos del Agente que
realiza la visita.

Si el cliente cierra una operación de compra o arriendo de un inmueble de la agencia, se debe registrar una
comisión del 1.0 % de la operación para el gerente de la agencia y de un 3.0 % para el agente de ventas. Por
su parte, el propietario debe cancelar una comisión del 3.0 % de la operación.

# El programa debe permitir consultar:

1.- Inmuebles registrados (casa o departamento, local comercial, bodega).\
2.- Clientes registrados.\
3.- Ventas de inmuebles (casa o departamento, local comercial, bodega).\
4.- Arriendos de inmuebles (casa o departamento, local comercial, bodega)

# También, el programa deberá permitir visualizar:

1.- Lo pagado en pesos por todas las comisiones de todos los clientes (individual y global)\
2.- Total de ingresos por ventas (individual y global)\
3.- Total de ingresos por arriendo (individual y global)\
4.- Total, de ingresos (ventas y arriendos)

# Consideraciones Generales:

1.- GUI con Swing\
2.- Validaciones en todo el proyecto\
3.- Excepciones en todo el proyecto\
4.- Almacenamiento en ArrayList\
5.- Exportación a TXT de todos los datos almacenados\
6.- UX/UI\
7.- Presentación con defensa. 
