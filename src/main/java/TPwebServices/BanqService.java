package TPwebServices;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService
public class BanqService {
    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 10.50;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random()*2000,new Date());
    }
    @WebMethod
    public List<Compte> ListComptes() {
        return List.of(
                new Compte(1,Math.random()*2000,new Date()),
                new Compte(2,Math.random()*2000,new Date()),
                new Compte(3,Math.random()*2000,new Date()));
    }

}
