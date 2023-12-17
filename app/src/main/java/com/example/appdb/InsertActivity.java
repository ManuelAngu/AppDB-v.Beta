package com.example.appdb;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class InsertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        Button buttonInfo = findViewById(R.id.buttonInfo);
        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InsertActivity.this,Info_Activity.class);
                startActivity(intent);
            }
        });

        Button btnContact = findViewById(R.id.btnContact);
        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InsertActivity.this,Contacto_Activity.class);
                startActivity(intent);
            }
        });

        Button btnInserta = findViewById(R.id.btnInsertAct);
        btnInserta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Modelo modelo = new Modelo();
                List<UsuariosDTO> userList = new ArrayList<>();

                UsuariosDTO usr1 = new UsuariosDTO();
                usr1.setId("1");
                usr1.setNombre("Hipérico");
                usr1.setPropiedades("PROPIEDADES: Su uso principal es por via tópica  donde tiene propiedades antisépticas y cicatrizantes , otras de astringencia y de carácter antiviral."+
                        " Asimismo, también actúa como antiinflamatorio, antiespasmódico y diurético, debido a las flavonas," +
                        " aunque la acción más importante y estudiada es la antidepresiva.\n\n"+
                        " MORFOLOGÍA: Las flores son de color amarillo dorado, con pequeñas motas negras en sus bordes, el apelativo latino" +
                        " perforatum proviene de las pequeñas perforaciones que en realidad son bolsas de aceite esencial" +
                        " que pueden verse al trasluz en cada una de las hojas de esta planta. Son el doble de largos que los" +
                        " sépalos. Una peculiaridad de esta hierba es que, al aplastarla entre los dedos alguna de sus hojitas," +
                        " deja una mancha en la piel roja.");
                userList.add(usr1);


                UsuariosDTO usr2 = new UsuariosDTO();
                usr2.setId("2");
                usr2.setNombre("Calaminta");
                usr2.setPropiedades("PROPIEDADES:Se elaboran infusiones con las hojas, se han descrito propiedades antioxidantes y antibióticas."+
                        "Se le atribuyen propiedades, antiespasmódico, diurético y estomáquico.\n\n" +
                        "MORFOLOGÍA:La calaminta se caracteriza"+
                        "por ser una planta herbácea que suele crecer en zonas soleadas y en suelos bien drenados."+
                        "Esta planta se distingue por sus hojas ovaladas y dentadas, que desprenden un aroma agradable y"+
                        "fresco cuando se tocan.Sus flores, pequeñas y de tonalidades que van desde el blanco hasta el lila.");
                userList.add(usr2);


                UsuariosDTO usr3 = new UsuariosDTO();
                usr3.setId("3");
                usr3.setNombre("Adelfa");
                usr3.setPropiedades("VENENOSA:Su sintomatologia por consumo accidental son " +
                        "Latidos cardíacos irregulares o lentos, Presión arterial baja y Debilidad general.\n\n"+
                        "MORFOLOGÍA:La adelfa, también conocida como laurel rosa, es una planta ornamental que se encuentra comúnmente"+
                        "en jardines y paisajes urbanos. Su morfología se caracteriza por hojas perennes de color verde oscuro,"+
                        "con forma lanceolada y disposición opuesta en el tallo. las flores de la adelfa son"+
                        "llamativas y suelen tener tonalidades que van desde el blanco hasta el rosa intenso,"+
                        "formando racimos en la punta de las ramas.");
                userList.add(usr3);

                UsuariosDTO usr4 = new UsuariosDTO();
                usr4.setId("4");
                usr4.setNombre("Helicriso");
                usr4.setPropiedades("PROPIEDADES:Es antiinflamatoria, antitusiva y antialergénica, expectorante."+
                        "Además ofrece grandes cualidades como protectora dérmica, cicatrizante, bacteriostática,"+
                        "depurativa,hepatoprotectora,espasmolítico,diurética,colerética,colagoga.\n\n"+
                        "MORFOLOGÍA:El helicriso  es una planta herbácea vivaz o perenne, de olor agradable y sabor amargo, ramosa, con tallos entre 10 y 50 cm."+
                        "de altura y hojas enteras, lanceoladas,"+
                        "aspecto pajoso de color amarillo limón y brillante");
                userList.add(usr4);


                UsuariosDTO usr5 = new UsuariosDTO();
                usr5.setId("5");
                usr5.setNombre("Tomillo");
                usr5.setPropiedades("PROPIEDADES:Antiespasmódica, expectorante y antiséptica, el tomillo está especialmente indicado en el tratamiento" +
                        "de ciertas afecciones de las vías respiratorias altas, particularmente las que cursan con tos irritativa, laringitis," +
                        "bronquitis, asma, enfisema y gripe.\n\n" +
                        "MORFOLOGÍA:El tomillo es una planta herbácea perenne de la familia Lamiaceae, conocida por sus propiedades aromáticas y medicinales." +
                        "incluye tallos leñosos y ramificados, hojas opuestas, pequeñas y lanceoladas");
                userList.add(usr5);

                UsuariosDTO usr6 = new UsuariosDTO();
                usr6.setId("6");
                usr6.setNombre("Cardo");
                usr6.setPropiedades("PROPIEDADES:Favorece la reducción del colesterol. Ayuda a ir regularmente al baño por su contenido en fibra. "+
                        "Mejora la absorción del calcio, lo que previene la osteoporosis.Tambien es Diurético lo que previenen la retención de líquidos"+
                        "por su gran acción ya dicha diurética y depurativa.\n\n" +
                        "MORFOLOGÍA:El cardo es una planta herbácea bienal perteneciente " +
                        "a la familia Asteraceae, conocida por su morfología robusta y hojas espinosas. " +
                        "Sus tallos erectos y ramificados pueden alcanzar alturas considerables. Las hojas" +
                        "son grandes, compuestas y profundamente lobuladas, con márgenes dentados y " +
                        "espinas afiladas, lo que le confiere una apariencia distintiva." +
                        "Las flores se agrupan en cabezas globosas rodeadas por brácteas espinosas" +
                        "y presentan tonalidades que van desde el púrpura al azul");
                userList.add(usr6);

                UsuariosDTO usr7 = new UsuariosDTO();
                usr7.setId("7");
                usr7.setNombre("Escaramujo");
                usr7.setPropiedades("PROPIEDADES:El principal interés del escaramujo, aunque no el único, reside en su alto contenido en vitamina C," +
                        "el cual le confiere al escaramujo propiedades antiinfecciosas, antibacterianas y tonificantes muy benéficas.\n\n" +
                        "MORFOLOGÍA:El escaramujo, perteneciente al género Rosa y comúnmente asociado con la especie Rosa canina,"+
                        "es un arbusto silvestre de la familia Rosaceae. Su morfología incluye tallos espinosos, hojas compuestas"+
                        "con foliolos dentados, y flores blancas o rosadas que dan paso a los frutos conocidos como escaramujos."+
                        "Estos frutos son pequeños, redondos y de color rojo anaranjado, conteniendo numerosas semillas rodeadas por pulpa carnosa.");
                userList.add(usr7);

                UsuariosDTO usr8 = new UsuariosDTO();
                usr8.setId("8");
                usr8.setNombre("Cicuta");
                usr8.setPropiedades("MUY VENENOSA:los síntomas por consumo accidental son vómitos y diarrea, delirio, convulsiones y coma.\n\n"+
                        "MORFOLOGÍA:La cicuta es una planta venenosa perteneciente al género Conium, siendo la especie más conocida"+
                        "Conium maculatum. Esta planta, de aspecto herbáceo y perenne, pertenece a la familia Apiaceae."+
                        "Se caracteriza por tallos huecos, manchados de púrpura, y hojas finamente divididas, similar a la"+
                        "apariencia de perejil o zanahorias silvestres. Las flores,"+
                        "pequeñas y blancas, se agrupan en umbelas compuestas. Sin embargo, a pesar de su atractiva"+
                        "apariencia, la cicuta es altamente tóxica");
                userList.add(usr8);

                UsuariosDTO usr9 = new UsuariosDTO();
                usr9.setId("9");
                usr9.setNombre("Estramonio");
                usr9.setPropiedades("EXTREMADAMENTE VENENOSO:los sintomas por consumo accidental son resequedad de las membranas mucosas, dificultad al tragar y hablar, visión borrosa, " +
                        "fotofofobia (sensibilidad dolorosa a la luz), hipertermia (elevación de la temperatura corporal), confusión, " +
                        "agitación, conducta combativa y alucinaciones.\n\n" +
                        "MORFOLOGÍA:El estramonio, también conocido como Datura stramonium,"+
                        "es una planta herbácea anual perteneciente a la familia"+
                        "Solanaceae. Su morfología se caracteriza por tallos erectos"+
                        "y ramificados, hojas grandes y dentadas, y flores de forma"+
                        "acampanada que pueden ser blancas, amarillas o moradas, dependiendo"+
                        "de la variedad. Los frutos son cápsulas espinosas que contienen"+
                        "numerosas semillas. El estramonio es conocido por contener alcaloides tropano,"+
                        "como la escopolamina y la atropina, que le confieren propiedades psicoactivas y tóxicas.");
                userList.add(usr9);

                UsuariosDTO usr10 = new UsuariosDTO();
                usr10.setId("10");
                usr10.setNombre("Bayas Rojas");
                usr10.setPropiedades("MUY VENENOSA:en toda la zona mediterránea hay multitud de bayas rojas o frutos similares. En todos los "+
                        "casos son tóxicas e incluso abrasivas en contacto cutaneo por lo que no se recomienda el consumo ni manipulacion de ninguna.\n\n" +
                        "MORFOLOGÍA:Las bayas rojas en la zona mediterránea exhiben a menudo un atractivo color rojo, variando en tamaño "+
                        "y forma. Su textura jugosa y la presencia de humedad intrínseca contribuyen a su apariencia visualmente atractiva.");
                userList.add(usr10);

                UsuariosDTO usr11 = new UsuariosDTO();
                usr11.setId("11");
                usr11.setNombre("Mirto");
                usr11.setPropiedades("PROPIEDADES:Tiene propiedades calmantes, astringentes, antisépticas y antiinflamatorias y, además, neutraliza los"+
                        "malos olores.\n\n" +
                        "MORFOLOGÍA:La morfología del mirto se caracteriza por ser un arbusto perenne de hojas opuestas, simples y coriáceas,"+
                        "que desprenden un aroma característico. Sus flores son pequeñas, con numerosos estambres y pétalos generalmente blancos, aunque pueden variar en color"+
                        "según la especie. Los frutos son bayas carnosas, generalmente de color morado oscuro a negro, y contienen numerosas semillas.");
                userList.add(usr11);

                UsuariosDTO usr12 = new UsuariosDTO();
                usr12.setId("12");
                usr12.setNombre("Lavanda");
                usr12.setPropiedades("PROPIEDADES:Se utiliza para reducir el estrés y la ansiedad, disminuir la tensión arterial y facilitar el sueño. " +
                        "Es por ello un activo muy habitual en aromaterapia, donde se utiliza en aceites y también mezclas para difusor. " +
                        "También favorece la digestión y evita los mareos.\n\n" +
                        "MORFOLOGÍA:La lavanda (Lavandula spp.) es una planta herbácea perenne conocida por su distintivo aroma y propiedades medicinales."+
                        "Su morfología se caracteriza por hojas lineales y estrechas, dispuestas de manera opuesta en tallos leñosos."+
                        "Las flores, agrupadas en espigas, son pequeñas, tubulares y generalmente de color violeta o lila, aunque pueden variar según la especie.");
                userList.add(usr12);

                UsuariosDTO usr13 = new UsuariosDTO();
                usr13.setId("13");
                usr13.setNombre("Ajete");
                usr13.setPropiedades("PROPIEDADES:Favorece la dilatación de los vasos sanguíneos, mejora la fluidez de la sangre. Reduce el riesgo de " +
                        "padecer cáncer de estómago y cáncer de colon. Tiene propiedades bactericidas, combate virus, hongos y bacterias. " +
                        "Provoca un aumento en las secreciones digestivas y de bilis, mejora la digestión.\n\n" +
                        "MORFOLOGÍA:Los ajetes (Allium ursinum), también conocidos como ajos silvestres ,son plantas herbáceas bulbosas que pertenecen" +
                        "al género Allium. Estas plantas tienen hojas largas y lanceoladas que surgen de un bulbo subterráneo");
                userList.add(usr13);

                UsuariosDTO usr14 = new UsuariosDTO();
                usr14.setId("14");
                usr14.setNombre("Azufaifo");
                usr14.setPropiedades("PROPIEDADES:Uno de los usos más comunes es preparar un té con el fruto seco y beberlo para aliviar el dolor de " +
                        "garganta. Según diversos estudios médicos recientes, el azufaifo tiene la capacidad de disminuir la presión arterial " +
                        "y también puede ser utilizado en caso de anemia o problemas hepáticos.\n\n" +
                        "MORFOLOGÍA:El azufaifo es un árbol de morfología variable que "+
                        "puede alcanzar alturas de 5 a 12 metros. Su estructura incluye un tronco corto y " +
                        "generalmente torcido, con una corteza rugosa y grisácea. Las hojas son alternas, de " +
                        "forma ovalada o lanceolada, con márgenes dentados y una tonalidad verde brillante." +
                        "Las flores son pequeñas, de color amarillo verdoso, y se producen en racimos axilares." +
                        "Los frutos del azufaifo son drupas, generalmente de forma ovalada a redonda, y varían en" +
                        "color según la variedad, desde amarillo pálido hasta rojo oscuro o marrón");
                userList.add(usr14);

                UsuariosDTO usr15 = new UsuariosDTO();
                usr15.setId("15");
                usr15.setNombre("Amapola");
                usr15.setPropiedades("PROPIEDADES: La amapola presenta propiedades hipnóticas y sedantes, lo que la hace perfecta para tratar problemas nerviosos e insomnio." +
                        "También se aplica para mejorar el asma.Aun así, hay que tener precaución si decidimos consumir las hojas, tallo o cápsula, ya que tienen " +
                        "altos contenidos de opio y sus propiedades se intensifican.\n\n" +
                        "MORFOLOGÍA:La amapola común presenta una morfología caracterizada " +
                        "por un sistema radicular fibroso, tallos erectos y ramificados, hojas alternas y " +
                        "dentadas, y flores vistosas con cuatro pétalos en colores como rojo, naranja, rosa" +
                        " o blanco. Sus flores hermafroditas contienen órganos reproductores masculinos y " +
                        "femeninos, y después de la polinización, se forma una cápsula que alberga numerosas" +
                        " semillas.");
                userList.add(usr15);



                for (UsuariosDTO usr : userList) {
                    if (!modelo.existeUsuario(InsertActivity.this, usr.getId())) {
                        int resInsert = modelo.insertaUsuario(InsertActivity.this, usr);


                    } else {
                        int resModifica = modelo.modificaUsuario(InsertActivity.this, usr);

                    }
                }

                Intent intent = new Intent(InsertActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
