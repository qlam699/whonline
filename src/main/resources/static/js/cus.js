//lay link qua href cua the btn
$(".modal").on("show.bs.modal", function(e) {
	$('body').css('overflow', 'hidden');
	var link = $(e.relatedTarget);
	$(this).find(".modal-content").load(link.attr("href"));
});
// Reset modal box
$(".modal").on("hide.bs.modal", function() {
	$('body').css('overflow', '');
	$(".modal").attr("id", "mymodal");
	$(".modal-dialog").addClass("cascading-modal"); // modal login
	$(this).find(".modal-content").html("");
});
//message
toastr.options = {
	    "closeButton": true, // true/false
	    "debug": false, // true/false
	    "newestOnTop": false, // true/false
	    "progressBar": true, // true/false
	    "positionClass": "toast-bottom-right", // toast-top-right / toast-top-left / toast-bottom-right / toast-bottom-left
	    "preventDuplicates": false, // true/false
	    "onclick": null,
	    "showDuration": "500", // in milliseconds
	    "hideDuration": "1000", // in milliseconds
	    "timeOut": "7000", // in milliseconds
	    "extendedTimeOut": "1000", // in milliseconds
	    "showEasing": "swing",
	    "hideEasing": "linear",
	    "showMethod": "fadeIn",
	    "hideMethod": "fadeOut"
	}