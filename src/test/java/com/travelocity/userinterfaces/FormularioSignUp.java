package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioSignUp {

    public static final Target IN_CORREO_ELECTRONICO = Target.the("input de correo electronico").locatedBy("//input[@id='signupFormEmailInput']");
    public static final Target IN_NOMBRE = Target.the("input de nombre").locatedBy("//input[@id='signupFormFirstNameInput']");
    public static final Target IN_APELLIDO = Target.the("input de apellido").locatedBy("//input[@id='signupFormLastNameInput']");
    public static final Target IN_PASSWORD = Target.the("input de contraseña").locatedBy("////input[@id='signupFormPasswordInput']");
    public static final Target BUT_CONTINUAR = Target.the("boton de continuar").locatedBy("//button[@id='signupFormSubmitButton']");
    public static final Target DIV_MENSAJE_ERROR = Target.the("Div que almacena el mensaje de error").locatedBy("//form//div[@class='uitk-error-summary']");
    public static final Target IN_SESION_ABIERTA = Target.the("Checkbox mantener sesion abierta").locatedBy("//input[@id='rememberMeSignUpCheckbox']");


}
