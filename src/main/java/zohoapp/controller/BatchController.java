package zohoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zohoapp.entity.Batch;
import zohoapp.entity.Detail;
import zohoapp.service.BatchService;
import zohoapp.service.DetailService;

@Controller
public class BatchController {
	
	@Autowired
	private BatchService batchService;
	
	@Autowired
	private DetailService detailService;

	@RequestMapping("/listBatch")
	public String getAllBatches(Model model) {
		List<Batch> batches = batchService.getAllBatches();
		model.addAttribute("batches", batches);
		return "list_batch";
	}
	@RequestMapping("/batchInfo")
	public String batchInfo(@RequestParam("id")long id,Model model) {
		Batch batch = batchService.getOneBatch(id);
		model.addAttribute("batch", batch);
		return "batch_info";
	}
	@RequestMapping("/createDetails") 
	public String createDetails(@RequestParam("id")long id,Model model) {
		Batch batch = batchService.getOneBatch(id);
		model.addAttribute("batch", batch);
		return "create_Details";
	}
	@RequestMapping("/saveDetails")
	public String saveDetails(@ModelAttribute("detail")Detail detail,Model model) {
		detailService.save(detail);
		model.addAttribute("msg", "data is saved");
		return "create_Student";
	}

}
