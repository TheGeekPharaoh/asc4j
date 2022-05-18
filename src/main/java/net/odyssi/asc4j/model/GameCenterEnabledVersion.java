package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameCenterEnabledVersion implements Serializable {

	public enum TypeEnum {

		GAMECENTERENABLEDVERSIONS(String.valueOf("gameCenterEnabledVersions"));

		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		TypeEnum(String v) {
			this.value = v;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

		public String value() {
			return this.value;
		}
	}

	private static final long serialVersionUID = 6541466358015587670L;

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private static String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	private GameCenterEnabledVersionAttributes attributes;

	private String id;

	private ResourceLinks links;

	private GameCenterEnabledVersionRelationships relationships;
	private TypeEnum type;

	public GameCenterEnabledVersion attributes(GameCenterEnabledVersionAttributes attributes) {
		this.attributes = attributes;
		return this;
	}

	/**
	 * Get attributes
	 *
	 * @return attributes
	 **/
	@JsonProperty("attributes")
	public GameCenterEnabledVersionAttributes getAttributes() {
		return this.attributes;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	/**
	 * Get links
	 *
	 * @return links
	 **/
	@JsonProperty("links")
	public ResourceLinks getLinks() {
		return this.links;
	}

	/**
	 * Get relationships
	 *
	 * @return relationships
	 **/
	@JsonProperty("relationships")
	public GameCenterEnabledVersionRelationships getRelationships() {
		return this.relationships;
	}

	/**
	 * Get type
	 *
	 * @return type
	 **/
	@JsonProperty("type")
	public String getType() {
		if (this.type == null) {
			return null;
		}
		return this.type.value();
	}

	public GameCenterEnabledVersion id(String id) {
		this.id = id;
		return this;
	}

	public GameCenterEnabledVersion links(ResourceLinks links) {
		this.links = links;
		return this;
	}

	public GameCenterEnabledVersion relationships(GameCenterEnabledVersionRelationships relationships) {
		this.relationships = relationships;
		return this;
	}

	public void setAttributes(GameCenterEnabledVersionAttributes attributes) {
		this.attributes = attributes;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLinks(ResourceLinks links) {
		this.links = links;
	}

	public void setRelationships(GameCenterEnabledVersionRelationships relationships) {
		this.relationships = relationships;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GameCenterEnabledVersion {\n");

		sb.append("    type: ").append(toIndentedString(this.type)).append("\n");
		sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(this.attributes)).append("\n");
		sb.append("    relationships: ").append(toIndentedString(this.relationships)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public GameCenterEnabledVersion type(TypeEnum type) {
		this.type = type;
		return this;
	}
}
