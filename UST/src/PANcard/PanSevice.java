package PANcard;

import java.util.List;
import java.util.stream.Collectors;

import StreamDemo.StreamModel;

public class PanSevice {
	
	

	public static void main(String[] args) {
		
		List<PanModel> plist = new PanSevice().getList();
		List<PanModel> sorted =  plist.stream().filter(pan ->pan.getPancard().length()==10
				&& !pan.getPancard().contains(" ")
				&& pan.getPancard().substring(0, 5).chars().allMatch(Character :: isUpperCase)
				&& pan.getPancard().substring(5, 9).chars().allMatch(Character :: isDigit)
				&& Character.isUpperCase(pan.getPancard().charAt(9))).collect(Collectors.toList());

	System.out.println(sorted);
	
	}
	
	public List<PanModel> getList(){
		return new PanDao().getDetails();
		
	}

}
