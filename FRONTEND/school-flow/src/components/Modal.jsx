export default function Modal({open,onClose,children}){

if(!open) return null

return(

<div className="modal-overlay">

<div className="modal">

<button className="close" onClick={onClose}>X</button>

{children}

</div>

</div>

)

}