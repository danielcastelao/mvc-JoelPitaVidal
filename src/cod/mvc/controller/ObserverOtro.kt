package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.controller.Observer;


class ObserverOtro {
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an `Observable` object's
     * `notifyObservers` method to have all the object's
     * observers notified of the change.
     *
     * @param arg an argument passed to the `notifyObservers`
     * method.
     */
    fun update(arg: Coche) {
        println("Yo tambien me enteré que la velocidad cambio en $arg")
    }
}