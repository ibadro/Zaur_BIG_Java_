
package Lesson27;


public class Test4 {
    
    public static void main(String[] args) {
        
        int [] arr = {4, 8, 1};
        System.out.println("we have array");
        
        try{ 
            
            System.out.println(arr[5]);
            System.out.println("have a good day");
            
        }
        catch(ArrayIndexOutOfBoundsException e){ // ArrayIndexOutOfBoundsException - тип эксепшена, который мы ловим
            // если указать другой эксепшен в кэче, а не тот, что выпадет, то будет ошибка
            System.out.println("ArrayIndexOutOfBoundsException was catched: " + e);  
        } // ArrayIndexOutOfBoundsException was catched: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        finally{ // всегда срабатывает
            System.out.println("it's finally block");
        }
        
        // тк индекса 5-ого в массиве нет, тело трай не выполняется
        //  выполняется тело кэч, потому что мы обработали нужный эксепшен
        
    }
    
    // если в части трай выполняется условия, и мы имеем тру, то выполнится 
    // только тело трая, если же выпадает какой-то эксепшен
    // мы ловим его в кэче, указывая в скобках тип этого эксепшена,
    // если мы выловили указанный эксепшен, то выполняется тело кэча
    // тело блока файнали ВЫПОЛНЯЕТСЯ ВСЕГДА, В СЛУЧАЯ ЕСЛИ МЫ ИМЕЕМ ТРУ
    // И ВЫПОЛНЯЕТСЯ ТЕЛО БЛОКА ТРАЙ, А ТАКЖЕ В СЛУЧАЕ, ЕСЛИ МЫ ЛОВИМ ЭКСЕПШЕН
    // И МЫ ВЫПОЛНЯЕМ ТЕЛО БЛОКА КЭЧ
    // ФАЙНАЛИ ВЫПОЛНИТСЯ В ЛЮБОМ СЛУЧАЕ
    
}
