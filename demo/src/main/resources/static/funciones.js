function eliminar(id){
	Swal.fire({
  title: 'Esta seguro de eliminar?',
  text: "No podra recuperar lo borrado!",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonColor: '#3085d6',
  cancelButtonColor: '#d33',
  confirmButtonText: 'Si, Borrar!'
}).then((result) => {
  if (result.isConfirmed) {
	$.ajax({
		url:"/eliminar/"+id,
		success: function(res){
			console.log(res)
		}
	});
    Swal.fire(
      'Borrado!',
      'El elemento fue borrado',
      'success'
    ).then((ok)=>{
	if(ok){
		location.href="/listar";
	}
})
  }
})
}