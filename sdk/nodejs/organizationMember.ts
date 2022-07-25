// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource is used to manage the assignment of members and their roles within an organization.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const acmeAdmin = new auth0.OrganizationMember("acmeAdmin", {
 *     organizationId: auth0_organization.acme.id,
 *     userId: auth0_user.acme_user.id,
 *     roles: [auth0_role.admin.id],
 * });
 * ```
 *
 * ## Import
 *
 * As this is not a resource identifiable by an ID within the Auth0 Management API, organization_connection can be imported using a random string. We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) e.g.
 *
 * ```sh
 *  $ pulumi import auth0:index/organizationMember:OrganizationMember acme_admin 11f4a21b-011a-312d-9217-e291caca36c5
 * ```
 */
export class OrganizationMember extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationMemberState, opts?: pulumi.CustomResourceOptions): OrganizationMember {
        return new OrganizationMember(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/organizationMember:OrganizationMember';

    /**
     * Returns true if the given object is an instance of OrganizationMember.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationMember {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationMember.__pulumiType;
    }

    /**
     * The ID of the organization
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * Set(string). List of role IDs to assign to member.
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * The user ID of the member
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a OrganizationMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationMemberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationMemberArgs | OrganizationMemberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationMemberState | undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as OrganizationMemberArgs | undefined;
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OrganizationMember.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OrganizationMember resources.
 */
export interface OrganizationMemberState {
    /**
     * The ID of the organization
     */
    organizationId?: pulumi.Input<string>;
    /**
     * Set(string). List of role IDs to assign to member.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The user ID of the member
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OrganizationMember resource.
 */
export interface OrganizationMemberArgs {
    /**
     * The ID of the organization
     */
    organizationId: pulumi.Input<string>;
    /**
     * Set(string). List of role IDs to assign to member.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The user ID of the member
     */
    userId: pulumi.Input<string>;
}
