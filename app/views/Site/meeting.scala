package views.Site

object meeting {
	def apply (title:String, agenda:List[Pair[String,Any]]) = {
		<xml:group>
			<h3>{title}</h3>

			<h4>Agenda</h4>
			{renderDL(agenda)}
		</xml:group>
	}

	private def renderDL (dl:List[Pair[String,Any]]) :Any = {
		<dl>
			{for ((key, value) <- dl) yield 
				<xml:group>
					<dt>{key}</dt>
					<dd>
					{value match {
						case l:List[Pair[String,Any]] => renderDL(l)
						case _ => value
					}}
					</dd>
				</xml:group>
			}
		</dl>
	}
}
