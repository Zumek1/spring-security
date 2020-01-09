package pl.robert.springsecurity;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotationApi {
    private List<Quotation> quotations;

    public QuotationApi(){
        this.quotations=new ArrayList<>();
        quotations.add(new Quotation("dupa","Robert"));
        quotations.add((new Quotation("psia","Natalia")));
    }




    @GetMapping("/api")
    public List<Quotation> getQuotations(){
        return quotations;

    }

    @PostMapping("/api")
    public boolean addQuotation(@RequestBody Quotation quotation){
        return quotations.add(quotation);
    }

    @DeleteMapping("/api")
    public void deleteQuotation (@RequestParam int index){
        quotations.remove(index);
    }

    }

