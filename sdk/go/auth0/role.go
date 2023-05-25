// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can create and manage collections of permissions that can be assigned to users, which are otherwise known as roles. Permissions (scopes) are created on `ResourceServer`, then associated with roles and optionally, users using this resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myResourceServer, err := auth0.NewResourceServer(ctx, "myResourceServer", &auth0.ResourceServerArgs{
//				Identifier:    pulumi.String("my-resource-server-identifier"),
//				SigningAlg:    pulumi.String("RS256"),
//				TokenLifetime: pulumi.Int(86400),
//				SkipConsentForVerifiableFirstPartyClients: pulumi.Bool(true),
//				EnforcePolicies: pulumi.Bool(true),
//				Scopes: auth0.ResourceServerScopeTypeArray{
//					&auth0.ResourceServerScopeTypeArgs{
//						Value:       pulumi.String("read:something"),
//						Description: pulumi.String("read something"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			myRole, err := auth0.NewRole(ctx, "myRole", &auth0.RoleArgs{
//				Description: pulumi.String("Role Description..."),
//				Permissions: auth0.RolePermissionTypeArray{
//					&auth0.RolePermissionTypeArgs{
//						ResourceServerIdentifier: myResourceServer.Identifier,
//						Name:                     pulumi.String("read:something"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewUser(ctx, "myUser", &auth0.UserArgs{
//				ConnectionName: pulumi.String("Username-Password-Authentication"),
//				UserId:         pulumi.String("auth0|1234567890"),
//				Email:          pulumi.String("test@test.com"),
//				Password:       pulumi.String("passpass$12$12"),
//				Nickname:       pulumi.String("testnick"),
//				Username:       pulumi.String("testnick"),
//				Roles: pulumi.StringArray{
//					myRole.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Existing roles can be imported using their ID. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/role:Role my_role XXXXXXXXXXXXXXXXXXXXXXX
//
// ```
type Role struct {
	pulumi.CustomResourceState

	// Description of the role.
	Description pulumi.StringOutput `pulumi:"description"`
	// Name for this role.
	Name pulumi.StringOutput `pulumi:"name"`
	// Configuration settings for permissions (scopes) attached to the role.
	//
	// Deprecated: Managing permissions through the `permissions` attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_role_permission` or `auth0_role_permissions` resource to manage role permissions instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md) for more info.
	Permissions RolePermissionTypeArrayOutput `pulumi:"permissions"`
}

// NewRole registers a new resource with the given unique name, arguments, and options.
func NewRole(ctx *pulumi.Context,
	name string, args *RoleArgs, opts ...pulumi.ResourceOption) (*Role, error) {
	if args == nil {
		args = &RoleArgs{}
	}

	if args.Description == nil {
		args.Description = pulumi.StringPtr("Managed by Pulumi")
	}
	var resource Role
	err := ctx.RegisterResource("auth0:index/role:Role", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRole gets an existing Role resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoleState, opts ...pulumi.ResourceOption) (*Role, error) {
	var resource Role
	err := ctx.ReadResource("auth0:index/role:Role", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Role resources.
type roleState struct {
	// Description of the role.
	Description *string `pulumi:"description"`
	// Name for this role.
	Name *string `pulumi:"name"`
	// Configuration settings for permissions (scopes) attached to the role.
	//
	// Deprecated: Managing permissions through the `permissions` attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_role_permission` or `auth0_role_permissions` resource to manage role permissions instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md) for more info.
	Permissions []RolePermissionType `pulumi:"permissions"`
}

type RoleState struct {
	// Description of the role.
	Description pulumi.StringPtrInput
	// Name for this role.
	Name pulumi.StringPtrInput
	// Configuration settings for permissions (scopes) attached to the role.
	//
	// Deprecated: Managing permissions through the `permissions` attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_role_permission` or `auth0_role_permissions` resource to manage role permissions instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md) for more info.
	Permissions RolePermissionTypeArrayInput
}

func (RoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*roleState)(nil)).Elem()
}

type roleArgs struct {
	// Description of the role.
	Description *string `pulumi:"description"`
	// Name for this role.
	Name *string `pulumi:"name"`
	// Configuration settings for permissions (scopes) attached to the role.
	//
	// Deprecated: Managing permissions through the `permissions` attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_role_permission` or `auth0_role_permissions` resource to manage role permissions instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md) for more info.
	Permissions []RolePermissionType `pulumi:"permissions"`
}

// The set of arguments for constructing a Role resource.
type RoleArgs struct {
	// Description of the role.
	Description pulumi.StringPtrInput
	// Name for this role.
	Name pulumi.StringPtrInput
	// Configuration settings for permissions (scopes) attached to the role.
	//
	// Deprecated: Managing permissions through the `permissions` attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_role_permission` or `auth0_role_permissions` resource to manage role permissions instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md) for more info.
	Permissions RolePermissionTypeArrayInput
}

func (RoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*roleArgs)(nil)).Elem()
}

type RoleInput interface {
	pulumi.Input

	ToRoleOutput() RoleOutput
	ToRoleOutputWithContext(ctx context.Context) RoleOutput
}

func (*Role) ElementType() reflect.Type {
	return reflect.TypeOf((**Role)(nil)).Elem()
}

func (i *Role) ToRoleOutput() RoleOutput {
	return i.ToRoleOutputWithContext(context.Background())
}

func (i *Role) ToRoleOutputWithContext(ctx context.Context) RoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleOutput)
}

// RoleArrayInput is an input type that accepts RoleArray and RoleArrayOutput values.
// You can construct a concrete instance of `RoleArrayInput` via:
//
//	RoleArray{ RoleArgs{...} }
type RoleArrayInput interface {
	pulumi.Input

	ToRoleArrayOutput() RoleArrayOutput
	ToRoleArrayOutputWithContext(context.Context) RoleArrayOutput
}

type RoleArray []RoleInput

func (RoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Role)(nil)).Elem()
}

func (i RoleArray) ToRoleArrayOutput() RoleArrayOutput {
	return i.ToRoleArrayOutputWithContext(context.Background())
}

func (i RoleArray) ToRoleArrayOutputWithContext(ctx context.Context) RoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleArrayOutput)
}

// RoleMapInput is an input type that accepts RoleMap and RoleMapOutput values.
// You can construct a concrete instance of `RoleMapInput` via:
//
//	RoleMap{ "key": RoleArgs{...} }
type RoleMapInput interface {
	pulumi.Input

	ToRoleMapOutput() RoleMapOutput
	ToRoleMapOutputWithContext(context.Context) RoleMapOutput
}

type RoleMap map[string]RoleInput

func (RoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Role)(nil)).Elem()
}

func (i RoleMap) ToRoleMapOutput() RoleMapOutput {
	return i.ToRoleMapOutputWithContext(context.Background())
}

func (i RoleMap) ToRoleMapOutputWithContext(ctx context.Context) RoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleMapOutput)
}

type RoleOutput struct{ *pulumi.OutputState }

func (RoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Role)(nil)).Elem()
}

func (o RoleOutput) ToRoleOutput() RoleOutput {
	return o
}

func (o RoleOutput) ToRoleOutputWithContext(ctx context.Context) RoleOutput {
	return o
}

// Description of the role.
func (o RoleOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Role) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Name for this role.
func (o RoleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Role) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Configuration settings for permissions (scopes) attached to the role.
//
// Deprecated: Managing permissions through the `permissions` attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_role_permission` or `auth0_role_permissions` resource to manage role permissions instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md) for more info.
func (o RoleOutput) Permissions() RolePermissionTypeArrayOutput {
	return o.ApplyT(func(v *Role) RolePermissionTypeArrayOutput { return v.Permissions }).(RolePermissionTypeArrayOutput)
}

type RoleArrayOutput struct{ *pulumi.OutputState }

func (RoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Role)(nil)).Elem()
}

func (o RoleArrayOutput) ToRoleArrayOutput() RoleArrayOutput {
	return o
}

func (o RoleArrayOutput) ToRoleArrayOutputWithContext(ctx context.Context) RoleArrayOutput {
	return o
}

func (o RoleArrayOutput) Index(i pulumi.IntInput) RoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Role {
		return vs[0].([]*Role)[vs[1].(int)]
	}).(RoleOutput)
}

type RoleMapOutput struct{ *pulumi.OutputState }

func (RoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Role)(nil)).Elem()
}

func (o RoleMapOutput) ToRoleMapOutput() RoleMapOutput {
	return o
}

func (o RoleMapOutput) ToRoleMapOutputWithContext(ctx context.Context) RoleMapOutput {
	return o
}

func (o RoleMapOutput) MapIndex(k pulumi.StringInput) RoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Role {
		return vs[0].(map[string]*Role)[vs[1].(string)]
	}).(RoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RoleInput)(nil)).Elem(), &Role{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleArrayInput)(nil)).Elem(), RoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleMapInput)(nil)).Elem(), RoleMap{})
	pulumi.RegisterOutputType(RoleOutput{})
	pulumi.RegisterOutputType(RoleArrayOutput{})
	pulumi.RegisterOutputType(RoleMapOutput{})
}
